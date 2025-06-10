package com.example.community.controller.user;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Goods;
import com.example.community.entity.GoodsEvaluate;
import com.example.community.service.ICartService;
import com.example.community.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("user/goods")
public class UserGoodsController {
    @Autowired
    private IGoodsService goodsService;
    @GetMapping("all/{pageNo}/{pageSize}")
    public Page<Goods> getCommunityGoods(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize){
        Page<Goods> page = new Page<>(pageNo,pageSize);
        return goodsService.getUserCommunityGoods(page);
    }
}
