package com.example.community.service.impl;

import com.example.community.entity.TrainFile;
import com.example.community.mapper.TrainFileMapper;
import com.example.community.service.ITrainFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-07
 */
@Service
@Primary
public class TrainFileServiceImpl extends ServiceImpl<TrainFileMapper, TrainFile> implements ITrainFileService {

}
