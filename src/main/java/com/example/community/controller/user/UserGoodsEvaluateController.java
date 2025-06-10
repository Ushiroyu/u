package com.example.community.controller.user;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.GoodsEvaluate;
import com.example.community.service.IGoodsEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("user/goods/evaluate")
public class UserGoodsEvaluateController {
    @Autowired
    private IGoodsEvaluateService goodsEvaluateService;
    @GetMapping("{goodsId}")
    public CommonVO getGoodsEvaluate(@PathVariable Integer goodsId){
        return goodsEvaluateService.getGoodsEvaluate(goodsId);
    }
    @PostMapping
    public CommonVO saveUserGoodsEvaluate(@RequestBody GoodsEvaluate goodsEvaluate){
        return goodsEvaluateService.saveUserGoodsEvaluate(goodsEvaluate);
    }
}
