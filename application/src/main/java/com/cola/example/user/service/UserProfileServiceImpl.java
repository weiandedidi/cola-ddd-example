package com.cola.example.user.service;

import com.cola.example.api.UserProfileServiceI;
import com.cola.example.dto.UserProfileAddCmd;
import com.cola.example.dto.UserProfileGetQry;

/**
 * client的api定义接口，Application实现，通过简单实现或者调用domain服务实现
 *
 * @author maqidi
 * @date 2023/12/15 7:38 PM
 */
public class UserProfileServiceImpl implements UserProfileServiceI {

    @Override
    public String addUserProfile(UserProfileAddCmd cmd) {
        return null;
    }

    @Override
    public String getUserProfileBy(UserProfileGetQry qry) {
        return null;
    }
}
