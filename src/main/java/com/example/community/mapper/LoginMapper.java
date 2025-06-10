package com.example.community.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface LoginMapper {
    String checkLogin(String token);
}
