package com.cola.example.dto;

import com.cola.example.dto.clientobject.UserProfileCO;
import lombok.Data;

/**
 * UserProfileAddCmd
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:20 PM
 */
@Data
public class UserProfileAddCmd extends CommonCommand {

    private UserProfileCO userProfileCO;
}
