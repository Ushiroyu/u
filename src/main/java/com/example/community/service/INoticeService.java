package com.example.community.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Notice;
import com.baomidou.mybatisplus.extension.service.IService;
public interface INoticeService extends IService<Notice> {
    CommonVO addNotice(Notice notice);
    IPage<?> getNotices(Integer mode, Integer pageNo, Integer pageSize);
}
