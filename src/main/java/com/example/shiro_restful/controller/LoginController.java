package com.example.shiro_restful.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LoginController {

    private static String userName = "admin";

    private static String password = "123456";

    @PostMapping("/login")
    public String add(String userName,String password){

        if(userName.equals(userName) && password.equals(password)){
            return "success";
        }
        return "error";
    }
}
