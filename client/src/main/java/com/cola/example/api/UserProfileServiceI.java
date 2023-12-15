package com.cola.example.api;


import com.cola.example.dto.UserProfileAddCmd;
import com.cola.example.dto.UserProfileGetQry;

/**
 * UserProfileServiceI
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:15 PM
 */
public interface UserProfileServiceI {
    String addUserProfile(UserProfileAddCmd cmd);
    //接口的场景定义这里
    String getUserProfileBy(UserProfileGetQry qry);
    //单反回查询
//    SingleResponse<UserProfileCO> getUserProfileBy(UserProfileGetQry qry);
    //返回list查询
//    MultiResponse<UserProfileCO>  listUserProfileBy(UserProfileListQry qry);
}
