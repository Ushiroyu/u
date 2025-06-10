package com.example.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.RoleMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-24
 */
public interface IRoleMenuService extends IService<RoleMenu> {

    CommonVO updateRoleMenu(Integer roleId, List<Integer> menuIds);
}
