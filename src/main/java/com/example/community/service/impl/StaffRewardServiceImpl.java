package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.util.DateUtil;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffReward;
import com.example.community.mapper.StaffRewardMapper;
import com.example.community.service.IStaffRewardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class StaffRewardServiceImpl extends ServiceImpl<StaffRewardMapper, StaffReward> implements IStaffRewardService {
    @Autowired
    private StaffRewardMapper staffRewardMapper;
    @Override
    public CommonVO saveStaffReward(StaffReward staffReward) {
        staffReward.setActionUserId(UserUtil.getUserId());
        staffReward.setCreateTime(DateUtil.getCurrentDate());
        int insert = staffRewardMapper.insert(staffReward);
        return new CommonVO(insert==1,insert==1?"发放成功":"发放失败");
    }
}
