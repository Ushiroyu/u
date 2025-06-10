package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
public interface IRoleService extends IService<Role> {
    CommonVO deleteRole(Integer roleId);
}
