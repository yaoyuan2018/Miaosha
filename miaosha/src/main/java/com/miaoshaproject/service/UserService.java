package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Author: Y_uan
 * @Date: 2018/12/24 16:20
 * @mail: yy494818027@163.com
 */
public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /*
    telphone:用户注册手机
    password:用户加密后的密码
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
