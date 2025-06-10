package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScoreLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
public interface IStaffScoreLogService extends IService<StaffScoreLog> {

    CommonVO getStaffScoreLogs(String userId);

    CommonVO insertStaffScoreLog(StaffScoreLog staffScoreLog);
}
