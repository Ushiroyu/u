package com.example.community.mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.CartItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@Mapper
public interface CartItemMapper extends BaseMapper<CartItem> {
    IPage<?> getCartItems(Integer cartId, Page<Map<String, Object>> page);
}
