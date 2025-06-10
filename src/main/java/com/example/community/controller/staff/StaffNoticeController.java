package com.example.community.controller.staff;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Notice;
import com.example.community.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("staff/notice")
public class StaffNoticeController {
    @Autowired
    private INoticeService noticeService;
    @GetMapping("all/{pageNo}/{pageSize}")
    public IPage<?> getNotices(Integer mode,@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize) {
        return noticeService.getNotices(mode,pageNo,pageSize);
    }
}
