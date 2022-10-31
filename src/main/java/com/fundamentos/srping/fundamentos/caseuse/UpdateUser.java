package com.fundamentos.srping.fundamentos.caseuse;

import com.fundamentos.srping.fundamentos.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService){
        this.userService = userService;
    }
}
