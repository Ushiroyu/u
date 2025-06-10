package com.example.community.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScore;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
public interface IStaffScoreService extends IService<StaffScore> {

    CommonVO gotStaffScore(String userId);

    IPage<?> getStaffScores(Integer pageNo, Integer pageSize);
}
