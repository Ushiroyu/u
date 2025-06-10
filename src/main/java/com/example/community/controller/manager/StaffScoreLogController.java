package com.example.community.controller.manager;


import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScoreLog;
import com.example.community.service.IStaffScoreLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
@RestController
@RequestMapping("manager/staffScoreLog")
public class StaffScoreLogController {

    @Autowired
    private IStaffScoreLogService staffScoreLogService;

    @GetMapping("{userId}")
    public CommonVO getStaffScoreLogs(@PathVariable String userId){

        return staffScoreLogService.getStaffScoreLogs(userId);
    }
    
    @PostMapping
    public CommonVO insertStaffScoreLog(@RequestBody StaffScoreLog staffScoreLog){
        return staffScoreLogService.insertStaffScoreLog(staffScoreLog);
    }
}
