package com.example.community.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.util.DateUtil;
import com.example.community.common.util.UserUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Notice;
import com.example.community.mapper.NoticeMapper;
import com.example.community.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public CommonVO addNotice(Notice notice) {
        notice.setActionUserId(UserUtil.getUserId());
        notice.setCreateTime(DateUtil.getCurrentDate());
        int insert = noticeMapper.insert(notice);
        return new CommonVO(insert==1,insert==1?"添加成功":"添加失败");
    }
    @Override
    public IPage<?> getNotices(Integer mode, Integer pageNo, Integer pageSize) {
        Page<Notice> page = new Page<>(pageNo, pageSize);
        if(mode == null || mode == 0){
            return noticeMapper.selectPage(page,null);
        } else {
            return noticeMapper.selectPage(page,new QueryWrapper<Notice>().eq("mode",mode));
        }
    }
}
