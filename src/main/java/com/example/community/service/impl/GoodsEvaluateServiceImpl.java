package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.community.common.util.DateUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.GoodsEvaluate;
import com.example.community.mapper.GoodsEvaluateMapper;
import com.example.community.service.IGoodsEvaluateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Primary
public class GoodsEvaluateServiceImpl extends ServiceImpl<GoodsEvaluateMapper, GoodsEvaluate> implements IGoodsEvaluateService {
    @Autowired
    private GoodsEvaluateMapper goodsEvaluateMapper;
    @Override
    public CommonVO saveUserGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        goodsEvaluate.setCreateTime(DateUtil.getCurrentDate());
        goodsEvaluate.setUpdateTime(DateUtil.getCurrentDate());
        int insert = goodsEvaluateMapper.insert(goodsEvaluate);
        return new CommonVO(insert==1,insert==1?"评价成功":"评价失败");
    }
    @Override
    public CommonVO getGoodsEvaluate(Integer goodsId) {
        List<?> goodsEvaluates = goodsEvaluateMapper.getGoodsEvaluate(goodsId);
        return new CommonVO(true,goodsEvaluates);
    }
}
