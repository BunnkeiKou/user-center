package com.hwh.usercenter.service;

import com.hwh.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 17303
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-04-22 15:34:26
*/

//接口内的方法默认public
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * @param userAccount 用户登录
     * @param userPassword 用户密码
     * @return 返回脱敏信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafeUser(User user);
    int userLogout(HttpServletRequest request);
}
