package com.example.community.service.impl;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.UserApply;
import com.example.community.mapper.UserApplyMapper;
import com.example.community.service.IUserApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class UserApplyServiceImpl extends ServiceImpl<UserApplyMapper, UserApply> implements IUserApplyService {
    @Autowired
    private UserApplyMapper userApplyMapper;
    @Override
    public CommonVO apply(String grouper) {
        UserApply userApply = new UserApply(UserUtil.getUserId(), grouper);
        int insert = userApplyMapper.insert(userApply);
        return new CommonVO(insert==1,insert==1?"申请成功":"申请失败");
    }
}
