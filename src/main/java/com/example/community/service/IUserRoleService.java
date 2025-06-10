package com.example.community.service;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
public interface IUserRoleService extends IService<UserRole> {
    CommonVO getUserRoleById(String userId);
    CommonVO updateUserRoleById(String userId, List<Integer> roleIds);
    CommonVO addRoleBatch(MultipartFile[] files, String userRoleName);
    CommonVO addRoleSingle(String userId, String userRoleName);
    CommonVO deleteRole(String userId, String userRoleName);
    boolean checkRole(String userId, String userRoleName);
}
