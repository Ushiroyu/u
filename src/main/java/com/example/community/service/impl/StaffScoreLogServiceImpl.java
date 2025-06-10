package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.community.common.util.DateUtil;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffScore;
import com.example.community.entity.StaffScoreLog;
import com.example.community.mapper.StaffScoreLogMapper;
import com.example.community.mapper.StaffScoreMapper;
import com.example.community.service.IStaffScoreLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
@Service
public class StaffScoreLogServiceImpl extends ServiceImpl<StaffScoreLogMapper, StaffScoreLog> implements IStaffScoreLogService {
    @Autowired
    private StaffScoreLogMapper staffScoreLogMapper;
    @Autowired
    private StaffScoreMapper staffScoreMapper;
    @Override
    public CommonVO getStaffScoreLogs(String userId) {
        List<StaffScoreLog> logs = staffScoreLogMapper.selectList(new QueryWrapper<StaffScoreLog>().eq("user_id", userId));
        return new CommonVO(true,logs);
    }
    @Override
    public CommonVO insertStaffScoreLog(StaffScoreLog staffScoreLog) {
        String userId = staffScoreLog.getUserId();
        StaffScore staffScore = staffScoreMapper.selectOne(new QueryWrapper<StaffScore>().eq("user_id", userId));
        staffScoreLog.setBeforeScore(staffScore.getScore());
        BigDecimal afterScore;
        if(staffScoreLog.getAction()){
            afterScore = staffScore.getScore().add(staffScoreLog.getChangeScore());
        } else {
            afterScore = staffScore.getScore().subtract(staffScoreLog.getChangeScore());
        }
        staffScoreLog.setAfterScore(afterScore);
        staffScoreLog.setLogTime(DateUtil.getCurrentDate());
        staffScoreLog.setActionUserId(UserUtil.getCurrentUser().getUserId());
        staffScore.setScore(afterScore);
        staffScoreLogMapper.insert(staffScoreLog);
        staffScoreMapper.updateById(staffScore);
        return new CommonVO(true,"变更成功");
    }
}
