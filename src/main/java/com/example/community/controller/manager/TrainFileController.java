package com.example.community.controller.manager;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.TrainFile;
import com.example.community.service.ITrainFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-07
 */

@RestController
@RequestMapping("manager/trainFile")
public class TrainFileController {
    
    @Autowired
    private ITrainFileService trainFileService;
    
    
    @GetMapping("byTrainId/{trainId}")
    public CommonVO getTrainFilesByTrainId(@PathVariable Integer trainId){
        List<TrainFile> trainFiles = trainFileService.list(new QueryWrapper<TrainFile>().eq("train_id", trainId));
        return new CommonVO(true,trainFiles);
    }

}
