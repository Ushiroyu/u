package com.example.community.mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    IPage<?> getTable(String userId,Page<Order> page);
    IPage<?> getStoreOrderTable(String storeId, Page<Order> page);
}
