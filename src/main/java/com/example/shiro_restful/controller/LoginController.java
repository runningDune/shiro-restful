package com.example.shiro_restful.controller;


import com.example.shiro_restful.utils.RedisUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class LoginController {

    private static String userName = "admin";

    private static String password = "123456";

    @Autowired
    private RedisUtils redisUtils;

    @PostMapping("/login")
    public String add(String userName,String password){

        redisUtils.set("loginTest","success");
        try{
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
            subject.login(token);
            return "success";
        }catch(AuthenticationException ae){
            System.out.println("login failed :" + ae.getMessage());
        }

        return "error";
    }

    @PostMapping("/shiro-redis/login")
    public String eurekaLogin(String userName,String password){

        redisUtils.set("loginTest","success");
        try{
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
            subject.login(token);
            return "success";
        }catch(AuthenticationException ae){
            System.out.println("login failed :" + ae.getMessage());
        }

        return "error";
    }


}
