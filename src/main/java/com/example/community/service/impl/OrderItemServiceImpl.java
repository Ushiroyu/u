package com.example.community.service.impl;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.OrderItem;
import com.example.community.mapper.OrderItemMapper;
import com.example.community.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-21
 */
@Service
@Primary
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;
    
    @Override
    public CommonVO getOrderItems(Integer orderId) {
        List<?> orderItems =  orderItemMapper.getOrderItems(orderId);
        return new CommonVO(true,orderItems);
    }
}
