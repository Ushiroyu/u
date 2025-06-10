package com.example.community.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.entity.Community;
import com.baomidou.mybatisplus.extension.service.IService;
public interface ICommunityService extends IService<Community> {
    IPage<?> table(String level, String parentCode, Integer pageNo, Integer pageSize);
}
