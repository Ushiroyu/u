package com.example.community.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffReward;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IStaffRewardService extends IService<StaffReward> {
    CommonVO saveStaffReward(StaffReward staffReward);
}
