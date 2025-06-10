package com.example.community.controller.admin;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.TTest;
import com.example.community.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("test/{id}")
    @ResponseBody
    public TTest getTestById(@PathVariable String id){
        TTest testById = testService.getTestById(id);
        return testById;
    }
    @GetMapping("tests/{pageNo}/{pageSize}")
    @ResponseBody
    public Page getTestS(@PathVariable(value = "pageNo") Integer pageNo,@PathVariable(value = "pageSize") Integer pageSize){
        Page<TTest> testPage = new Page<>(pageNo,pageSize);
        Page<TTest> page = testService.page(testPage, null);
        return page;
    }
}
