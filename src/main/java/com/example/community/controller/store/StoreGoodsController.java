package com.example.community.controller.store;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.util.DateUtil;
import com.example.community.common.util.FileUtil;
import com.example.community.common.util.UserUtil;
import com.example.community.entity.Goods;
import com.example.community.service.ICategoryService;
import com.example.community.service.IGoodsService;
import com.example.community.common.vo.CommonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("store/goods")
public class StoreGoodsController {
    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private ICategoryService categoryService;
    @PostMapping
    public CommonVO saveGoods(@RequestBody Goods goods){
        goods.setGoodsStoreId(UserUtil.getUserId());
        goods.setUpdateTime(DateUtil.getCurrentDate());
        boolean save = goodsService.save(goods);
        String resMsg = save?"保存成功":"保存失败";
        return new CommonVO(save,resMsg);
    }
    @DeleteMapping("{id}")
    public CommonVO deleteGoods(@PathVariable Integer id){
        return goodsService.deleteGoods(id);
    }
    @PostMapping("update")
    public CommonVO updateGoods(@RequestParam(value = "files",required = false) MultipartFile[] multipartFiles,@RequestParam("goods") String goodsJson){
        Goods goods = JSONObject.parseObject(goodsJson, Goods.class);
        return goodsService.updateGoods(multipartFiles,goods);
    }
    @GetMapping("{id}")
    public CommonVO getGoods(@PathVariable Integer id){
        Goods goods = goodsService.getById(id);
        return new CommonVO(true,goods);
    }
    @GetMapping("all/{pageNo}/{pageSize}")
    public Page<Goods> getGoodsAll(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize){
        Page<Goods> page = new Page<>(pageNo,pageSize);
        return goodsService.page(page,new QueryWrapper<Goods>().eq("GOODS_STORE_ID",UserUtil.getUserId()));
    }
    @GetMapping("category/{id}")
    public CommonVO getAllLevelByCatId(@PathVariable Integer id){
        return categoryService.getAllLevelByCatId(id);
    }
    @GetMapping("category/two/{id}")
    public CommonVO getTwoByOne(@PathVariable Integer id){
        List<Map<String, Object>> twoByOne = categoryService.getTwoByOne(id);
        return new CommonVO(true,twoByOne);
    }
    @GetMapping("category/three/{id}")
    public CommonVO getThreeByTwo(@PathVariable Integer id){
        List<Map<String, Object>> threeByTwo = categoryService.getThreeByTwo(id);
        return new CommonVO(true,threeByTwo);
    }
}
