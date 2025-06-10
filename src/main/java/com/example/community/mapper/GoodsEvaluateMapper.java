package com.example.community.mapper;
import com.example.community.entity.GoodsEvaluate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface GoodsEvaluateMapper extends BaseMapper<GoodsEvaluate> {
    List<?> getGoodsEvaluate(Integer goodsId);
}
