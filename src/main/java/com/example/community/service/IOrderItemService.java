package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.OrderItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-21
 */
public interface IOrderItemService extends IService<OrderItem> {

    CommonVO getOrderItems(Integer orderId);
}
