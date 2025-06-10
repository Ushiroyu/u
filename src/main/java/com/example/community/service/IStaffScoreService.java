package com.example.community.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScore;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IStaffScoreService extends IService<StaffScore> {
    CommonVO gotStaffScore(String userId);
    IPage<?> getStaffScores(Integer pageNo, Integer pageSize);
}
