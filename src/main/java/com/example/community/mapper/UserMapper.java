package com.example.community.mapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.Role;
import com.example.community.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<Role> getUserRolesById(String userId);
    IPage<User> getAllUserSimple(String name, String userId,
                                              Page<?> page);
    IPage<?> getUsersByRole(String userRole, Page<User> userPage);
}
