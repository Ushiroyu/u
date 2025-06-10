package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.GoodsEvaluate;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IGoodsEvaluateService extends IService<GoodsEvaluate> {
    CommonVO saveUserGoodsEvaluate(GoodsEvaluate goodsEvaluate);
    CommonVO getGoodsEvaluate(Integer goodsId);
}
