package com.cola.example.gatewayImpl;

import com.cola.example.user.entity.User;
import com.cola.example.user.gateway.UserRepository;

import java.util.List;

/**
 * @author maqidi
 * @date 2023/12/15 7:52 PM
 */
public class UserRepositoryImpl implements UserRepository {

    //引入mybatis文件
    @Override
    public void add(User user) {

    }

    @Override
    public List<User> getUsers(List<Long> userIds) {
        return null;
    }
}
