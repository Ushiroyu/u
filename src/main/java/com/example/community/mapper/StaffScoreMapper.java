package com.example.community.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.StaffScore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
@Mapper
public interface StaffScoreMapper extends BaseMapper<StaffScore> {

    IPage<?> getStaffScores(Page<?> page);
}
