package com.example.shiro_restful.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserManageController {

    @PostMapping("/get")
    public String get(String userId){

        return "get" + userId;
    }

    @PostMapping("/add")
    public String add(String userId){

        return "add" + userId;
    }

}
