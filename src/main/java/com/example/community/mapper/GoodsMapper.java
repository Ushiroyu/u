package com.example.community.mapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    Page<Goods> getCommunityGoods(Integer communityId, Page<Goods> page);
    Page<Goods> getStoreGoods(Page<Goods> page);
    List<Map<String, Object>> getStoreDayData(String storeId,String date);
    List<Map<String, Object>> getStoreMonthAnalysis(String storeId, String date);
}
