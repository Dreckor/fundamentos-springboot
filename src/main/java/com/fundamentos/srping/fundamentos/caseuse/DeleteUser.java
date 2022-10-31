package com.fundamentos.srping.fundamentos.caseuse;

import com.fundamentos.srping.fundamentos.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UpdateUser {
    private UserService userService;

    public UpdateUser(UserService userService){
        this.userService = userService;
    }
}
