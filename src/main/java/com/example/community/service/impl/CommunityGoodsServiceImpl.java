package com.example.community.service.impl;

import com.example.community.entity.CommunityGoods;
import com.example.community.mapper.CommunityGoodsMapper;
import com.example.community.service.ICommunityGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-20
 */
@Service
@Primary
public class CommunityGoodsServiceImpl extends ServiceImpl<CommunityGoodsMapper, CommunityGoods> implements ICommunityGoodsService {

}
