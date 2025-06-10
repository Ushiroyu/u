package com.example.community.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.community.entity.TTest;
import com.example.community.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TestService extends ServiceImpl<TestMapper,TTest> {
    @Autowired
    TestMapper testMapper;
    public TTest getTestById(String id){
        TTest test = testMapper.getTest(id);
        return test;
    }
}
