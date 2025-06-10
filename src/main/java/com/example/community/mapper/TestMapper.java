package com.example.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.community.entity.TTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author : zhangxiaojian
 * Date : 2021/3/1
 */
//@Repository
@Mapper
public interface TestMapper extends BaseMapper<TTest> {
    
    
    TTest getTest(String id);
}
