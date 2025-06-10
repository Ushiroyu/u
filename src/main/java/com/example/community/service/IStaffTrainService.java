package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffTrain;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;
public interface IStaffTrainService extends IService<StaffTrain> {
    CommonVO getStaffTrainDetail(Integer trainId);
    CommonVO saveTrainAndUpload(MultipartFile[] multipartFiles, String trainName, String trainContent);
    CommonVO deleteStaffTrain(Integer trainId);
}
