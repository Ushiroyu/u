package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-11
 */
public interface IRoleService extends IService<Role> {

    CommonVO deleteRole(Integer roleId);
}
