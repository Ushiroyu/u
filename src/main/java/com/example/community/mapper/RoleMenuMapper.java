package com.example.community.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.community.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    List<Integer> getMenuIdsByRoleId(Integer roleId,boolean onlyLeaf);
}
