package com.cola.example.uinterface.web;

import com.cola.example.api.UserProfileServiceI;
import com.cola.example.dto.UserProfileAddCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maqidi
 * @date 2023/12/15 7:44 PM
 */
@RestController
public class UserWebController {
    @Autowired
    UserProfileServiceI userProfileService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    String addUserProfile(String content) {
        UserProfileAddCmd cmd = new UserProfileAddCmd();
        return userProfileService.addUserProfile(cmd);
    }

}
