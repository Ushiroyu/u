package com.example.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.community.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-24
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    List<Integer> getMenuIdsByRoleId(Integer roleId,boolean onlyLeaf);
}
