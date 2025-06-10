package com.example.community.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.RoleMenu;
import java.util.List;
public interface IRoleMenuService extends IService<RoleMenu> {
    CommonVO updateRoleMenu(Integer roleId, List<Integer> menuIds);
}
