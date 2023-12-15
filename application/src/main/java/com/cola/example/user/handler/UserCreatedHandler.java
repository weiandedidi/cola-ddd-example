package com.cola.example.user.handler;

import com.cola.example.user.service.UserDomainService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Application处理逻辑的策略类和具体方法，拓展点处理
 *
 * @author maqidi
 * @date 2023/12/15 7:41 PM
 */
public class UserCreatedHandler {
    @Autowired
    UserDomainService userDomainService;

    //处理UserDomainService的策略逻辑
    public void handle() {

    }
}
