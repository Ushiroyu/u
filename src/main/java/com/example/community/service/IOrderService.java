package com.example.community.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.ui.Model;
import java.util.Map;
public interface IOrderService extends IService<Order> {
    CommonVO createOrder(Order order);
    CommonVO createOrderDetail();
    IPage<?> getTable(Integer pageNo, Integer pageSize);
    CommonVO payForOrder(Integer orderId);
    CommonVO cancelOrder(Integer orderId);
    IPage<?> getStoreOrderTable(String storeId, Integer pageNo, Integer pageSize);
    CommonVO deliver(Map<String,String> map);
    CommonVO confirmArrived(Integer orderId);
    CommonVO confirmReceive(Integer orderId);
    CommonVO confirmOrderFinish(Integer orderItemId);
}
