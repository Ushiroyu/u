package com.example.community.controller.user;
import com.example.community.common.vo.CommonVO;
import com.example.community.service.IRegionService;
import com.example.community.service.IUserApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("user")
public class UserFunctionController {
    @Autowired
    private IUserApplyService userApplyService;
    @Autowired
    private IRegionService regionService;
    @GetMapping("community/{streetCode}")
    public CommonVO getCommunityByStreetCode(@PathVariable String streetCode){
        return new CommonVO(true,regionService.getCommunityByStreetCode(streetCode)); 
    }
    @PostMapping("apply/grouper")
    public CommonVO applyGrouper(){
        return userApplyService.apply("grouper");
    }
}
