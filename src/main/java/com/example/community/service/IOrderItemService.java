package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.OrderItem;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IOrderItemService extends IService<OrderItem> {
    CommonVO getOrderItems(Integer orderId);
}
