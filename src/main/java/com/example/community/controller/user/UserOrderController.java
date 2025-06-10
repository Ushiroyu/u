package com.example.community.controller.user;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Order;
import com.example.community.entity.OrderItem;
import com.example.community.service.IOrderItemService;
import com.example.community.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("user/order")
public class UserOrderController {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IOrderItemService orderItemService;
    @GetMapping("confirmOrderFinish/{orderItemId}")
    public CommonVO confirmOrderFinish(@PathVariable Integer orderItemId){
        return orderService.confirmOrderFinish(orderItemId);
    }
    @PutMapping("confirmReceive/{orderId}")
    public CommonVO confirmReceive(@PathVariable Integer orderId){
        return orderService.confirmReceive(orderId);
    }
    @PutMapping("payForOrder/{orderId}")
    public CommonVO payForOrder(@PathVariable Integer orderId){
        return orderService.payForOrder(orderId);
    }
    @PutMapping("cancelOrder/{orderId}")
    public CommonVO cancelOrder(@PathVariable Integer orderId){
        return orderService.cancelOrder(orderId);
    }
    @PostMapping
    public CommonVO createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
    @GetMapping("createOrderDetail")
    public CommonVO getCreateOrderDetail(){
        return orderService.createOrderDetail();
    }
    @GetMapping("orderItems/{orderId}")
    public CommonVO getOrderItems(@PathVariable Integer orderId){
        return orderItemService.getOrderItems(orderId);
    }
    @GetMapping("all/{pageNo}/{pageSize}")
    public IPage<?> getTable(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize){
        return orderService.getTable(pageNo,pageSize);
    }
}
