package com.fundamentos.srping.fundamentos.caseuse;

import com.fundamentos.srping.fundamentos.entity.User;
import com.fundamentos.srping.fundamentos.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService){
        this.userService = userService;
    }

    public User save(User newUser) {
        return userService.save(newUser);
    }
}
