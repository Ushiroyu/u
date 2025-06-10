package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.GoodsEvaluate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-24
 */
public interface IGoodsEvaluateService extends IService<GoodsEvaluate> {

    CommonVO saveUserGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    CommonVO getGoodsEvaluate(Integer goodsId);
}
