package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScore;
import com.example.community.entity.User;
import com.example.community.mapper.StaffScoreMapper;
import com.example.community.service.IStaffScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.community.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class StaffScoreServiceImpl extends ServiceImpl<StaffScoreMapper, StaffScore> implements IStaffScoreService {
    @Autowired
    private StaffScoreMapper staffScoreMapper;
    @Autowired
    private IUserRoleService userRoleService;
    @Override
    public CommonVO gotStaffScore(String userId) {
        boolean isStaff = userRoleService.checkRole(userId,"ROLE_GROUPER");
        if(isStaff){
            StaffScore staffScore = staffScoreMapper.selectOne(new QueryWrapper<StaffScore>().eq("user_id", userId));
            if(staffScore == null){
                staffScore = new StaffScore(userId);
                staffScoreMapper.insert(staffScore);
            }
            return new CommonVO(true,staffScore);
        } else {
            return new CommonVO(false,"该用户不为员工");
        }
    }
    @Override
    public IPage<?> getStaffScores(Integer pageNo, Integer pageSize) {
        Page<?> page = new Page<>(pageNo, pageSize);
        return staffScoreMapper.getStaffScores(page);
    }
}
