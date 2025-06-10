package com.example.community.controller.manager;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScore;
import com.example.community.service.IStaffScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
@RestController
@RequestMapping("manager/staffScore")
public class StaffScoreController {
    
    @Autowired
    private IStaffScoreService staffScoreService;
    
    @GetMapping("{userId}")
    public CommonVO getStaffScore(@PathVariable String userId){
        
        return staffScoreService.gotStaffScore(userId);
    }
    
    @GetMapping("all/{pageNo}/{pageSize}")
    public IPage<?> getAllStaffScore(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize) {
        return staffScoreService.getStaffScores(pageNo,pageSize);
    }

}
