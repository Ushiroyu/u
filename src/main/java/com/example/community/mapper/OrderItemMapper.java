package com.example.community.mapper;
import com.example.community.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
    List<?> getOrderItems(Integer orderId);
}
