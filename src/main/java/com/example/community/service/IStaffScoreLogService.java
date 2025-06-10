package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScoreLog;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IStaffScoreLogService extends IService<StaffScoreLog> {
    CommonVO getStaffScoreLogs(String userId);
    CommonVO insertStaffScoreLog(StaffScoreLog staffScoreLog);
}
