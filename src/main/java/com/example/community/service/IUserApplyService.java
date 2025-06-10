package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.UserApply;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-20
 */
public interface IUserApplyService extends IService<UserApply> {

    CommonVO apply(String grouper);
}
