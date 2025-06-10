package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.community.common.util.NullUtils;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Role;
import com.example.community.entity.RoleMenu;
import com.example.community.mapper.RoleMenuMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.community.service.IRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
@Primary
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {
    @Autowired
    private RoleMenuMapper roleMenuMapper;
    @Override
    public CommonVO updateRoleMenu(Integer roleId, List<Integer> menuIds) {
        List<Integer> menuIdsByRoleId = roleMenuMapper.getMenuIdsByRoleId(roleId, false);
        if (!this.checkBaseMenu(roleId, menuIds)) {
            return new CommonVO(false, "该角色的 【角色相关菜单权限】 不可删除");
        }
        if (NullUtils.notEmpty(menuIds)) {
            roleMenuMapper.delete(new QueryWrapper<RoleMenu>().eq("role_id", roleId).notIn("menu_id", menuIds));
            for (Integer menuId : menuIds) {
                if (!menuIdsByRoleId.contains(menuId)) {
                    RoleMenu roleMenu = new RoleMenu(roleId, menuId);
                    roleMenuMapper.insert(roleMenu);
                }
            }
        } else {
            roleMenuMapper.delete(new QueryWrapper<RoleMenu>().eq("role_id", roleId));
        }
        return new CommonVO(true, "修改成功");
    }
    private boolean checkBaseMenu(Integer roleId, List<Integer> changeMenuIds) {
        if (roleId == 1) {
            if (changeMenuIds == null)
                return false;
            return changeMenuIds.contains(7) && changeMenuIds.contains(8) && changeMenuIds.contains(10) && changeMenuIds.contains(2);
        }
        return true;
    }
}
