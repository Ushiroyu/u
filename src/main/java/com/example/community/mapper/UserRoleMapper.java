package com.example.community.mapper;
import com.example.community.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
    List<Integer> getUserRolesIdById(String userId);
}
