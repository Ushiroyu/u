package com.example.community.mapper;
import com.example.community.entity.StaffTrain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface StaffTrainMapper extends BaseMapper<StaffTrain> {
    List<StaffTrain> getStaffTrainDetail(Integer trainId);
}
