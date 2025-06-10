package com.example.community.controller.system;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Role;
import com.example.community.service.IRoleMenuService;
import com.example.community.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("system/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IRoleMenuService roleMenuService;
    @PostMapping
    public CommonVO saveRole(@RequestBody Role role){
        role.setName("ROLE_"+role.getName());
        boolean save = roleService.save(role);
        return new CommonVO(save,save?"保存成功":"保存失败");
    }
    @PutMapping
    public CommonVO updateRole(@RequestBody Role role){
        boolean save = roleService.updateById(role);
        return new CommonVO(save,save?"修改成功":"修改失败");
    }
    @GetMapping("{roleId}")
    public CommonVO getRole(@PathVariable Integer roleId){
        Role byId = roleService.getById(roleId);
        return new CommonVO(true,byId);
    }
    @DeleteMapping("{roleId}")
    public CommonVO deleteRole(@PathVariable Integer roleId){
        return roleService.deleteRole(roleId);
    }
    @RequestMapping("all")
    public CommonVO getAllRoles(){
        List<Role> list = roleService.list();
        return new CommonVO(true,list);
    }
    @PutMapping("roleMenu")
    public CommonVO updateRoleMenu(@RequestParam(value="roleId")Integer roleId,@RequestParam(value="menuIds") List<Integer> menuIds){
        return roleMenuService.updateRoleMenu(roleId,menuIds);
    }
}
