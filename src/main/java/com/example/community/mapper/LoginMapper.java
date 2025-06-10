package com.example.community.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Author : zhangxiaojian
 * Date : 2021/4/26
 */
@Mapper
public interface LoginMapper {
    String checkLogin(String token);
}
