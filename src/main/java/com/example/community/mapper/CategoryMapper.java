package com.example.community.mapper;
import com.example.community.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
    Map<String, Object> getParentLevelId(Integer id);
    List<Map<String, Object>> getAllOne();
    List<Map<String, Object>> getTwoByOne(Integer one);
    List<Map<String, Object>> getThreeByTwo(Integer two);
}
