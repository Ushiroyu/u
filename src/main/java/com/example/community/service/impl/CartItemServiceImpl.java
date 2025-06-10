package com.example.community.service.impl;
import com.example.community.entity.CartItem;
import com.example.community.mapper.CartItemMapper;
import com.example.community.service.ICartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements ICartItemService {
}
