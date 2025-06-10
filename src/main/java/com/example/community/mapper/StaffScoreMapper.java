package com.example.community.mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.entity.StaffScore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface StaffScoreMapper extends BaseMapper<StaffScore> {
    IPage<?> getStaffScores(Page<?> page);
}
