package com.example.community.controller.system;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Goods;
import com.example.community.entity.Menu;
import com.example.community.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("system/menu")
public class MenuController {
    @Autowired
    IMenuService menuService;
    @DeleteMapping
    public CommonVO deleteMenu(Integer id){
        return menuService.deleteMenu(id);
    }
    @PostMapping
    public CommonVO saveMenu(@RequestBody Menu menu){
        boolean save = menuService.saveMenu(menu);
        return new CommonVO(save,save?"保存成功":"保存失败");
    }
    @GetMapping("{id}")
    public CommonVO getMenu(@PathVariable Integer id){
        return new CommonVO(true,menuService.getById(id));  
    }
    @PutMapping
    public CommonVO updateMenu(@RequestBody Menu menu){
        if(menu.getParentId() == null){
            menu.setParentId(0);
        }
        boolean update = menuService.updateById(menu);
        return new CommonVO(update,update?"修改成功":"修改失败");
    }
    @GetMapping("initLeftMenu")
    public List<Menu> getMenusByUserId() {
        return menuService.getMenusByUserId();
    }
    @GetMapping("IdAndName")
    public List<Menu> getAllMenusIdAndName() {
        return menuService.getAllMenusIdAndName();
    }
    @GetMapping("table")
    public CommonVO menuTable(String parentId, Integer pageNo, Integer pageSize, HttpServletRequest request){
        return new CommonVO(true,menuService.menuTable(parentId,pageNo,pageSize));
    }
    @GetMapping("tree")
    public CommonVO menuTree(){
        return new CommonVO(true,menuService.menuTree());
    }
    @GetMapping("easyTree")
    public CommonVO menuEasyTree(){
        return new CommonVO(true,menuService.getMenuEasyTree());
    }
    @GetMapping("ids/{roleId}")
    public List<Integer> getMenuIdsByRoleId(@PathVariable Integer roleId) {
        return menuService.getLeafMenuIdsByRoleId(roleId);
    }
}
