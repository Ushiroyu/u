package com.example.community.mapper;
import com.example.community.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface CartMapper extends BaseMapper<Cart> {
    Cart selectCartWithItems(String userId);
    Integer selectStoreCount(Integer cartId);
}
