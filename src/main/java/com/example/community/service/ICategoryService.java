package com.example.community.service;

import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-09
 */
public interface ICategoryService extends IService<Category> {

    List<Category> getCategoryTree();

    CommonVO getAllLevelByCatId(Integer id);

    List<Map<String,Object>> getAllOne();

    List<Map<String,Object>> getTwoByOne(Integer one);

    List<Map<String,Object>> getThreeByTwo(Integer two);
}
