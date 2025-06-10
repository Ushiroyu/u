package com.example.community.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.mapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Author : zhangxiaojian
 * Date : 2021/4/16
 */
public interface IRegionService {

    List<Map<String,Object>> getAllProvinces();

    List<Map<String, Object>> getCitysByProvinceCode(String provinceCode);

    List<Map<String, Object>> getAreasByCityCode(String cityCode);

    List<Map<String, Object>> getStreetsByAreaCode(String areaCode);

    CommonVO getAllLevelByCommunityId(Integer id);

    List<Map<String, Object>> getCommunityByStreetCode(String streetCode);
}
