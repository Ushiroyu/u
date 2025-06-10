package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.UserApply;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IUserApplyService extends IService<UserApply> {
    CommonVO apply(String grouper);
}
