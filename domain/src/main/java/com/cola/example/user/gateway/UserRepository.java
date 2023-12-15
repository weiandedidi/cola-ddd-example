package com.cola.example.user.gateway;

import com.cola.example.user.entity.User;

import java.util.List;

/**
 * @author maqidi
 * @date 2023/12/15 7:49 PM
 */
public interface UserRepository {

    void add(User user);

    List<User> getUsers(List<Long> userIds);
}
