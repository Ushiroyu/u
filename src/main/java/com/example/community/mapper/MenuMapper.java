package com.example.community.mapper;
import com.example.community.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> getAllMenusWithRole();
    List<Menu> getMenusByUserId(String userId);
    List<Menu> getAllMenusIdAndName();
}
