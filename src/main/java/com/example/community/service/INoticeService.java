package com.example.community.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Notice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-25
 */
public interface INoticeService extends IService<Notice> {

    CommonVO addNotice(Notice notice);

    IPage<?> getNotices(Integer mode, Integer pageNo, Integer pageSize);
}
