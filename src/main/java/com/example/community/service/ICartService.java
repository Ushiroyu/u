package com.example.community.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.community.entity.CartItem;
import com.example.community.entity.Goods;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-07
 */
public interface ICartService extends IService<Cart> {

    CommonVO addGoodsToCart(Integer goodsId);

    Cart haveUserCart();

    CommonVO haveUserCartWithItems(Integer pageNo,Integer pageSize);

    CommonVO removeGoodsFromCart(Integer cartItemId);

    Boolean clearCart(Integer cartId);

    CommonVO checkHaveGoods();
}
