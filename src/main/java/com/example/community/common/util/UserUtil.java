package com.example.community.common.util;

import com.example.community.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Author : zhangxiaojian
 * Date : 2021/3/11
 */
public class UserUtil {

    public static User getCurrentUser() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    public static String getUserId() {
        return UserUtil.getCurrentUser().getUserId();
    }
}
