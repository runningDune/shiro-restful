package com.example.shiro_restful.controller.user;

import com.example.shiro_restful.shiro.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserManageController {

    @Autowired
    private ShiroService shiroService;

    @PostMapping("/user/get")
    public String get(String userId){

        return "get" + userId;
    }

    @PostMapping("/shang/add")
    public String add(String userId){

        return "add" + userId;
    }

    @PostMapping("/user/test0")
    public String test0(String userId){

        return "test0" + userId;
    }

    @PostMapping("/user/test1")
    public String test1(String userId){

        return "test1" + userId;
    }

    @PostMapping("/user/test2")
    public String test2(String userId){

        return "test2" + userId;
    }

    @PostMapping("/user/test3")
    public String test3(String userId){

        return "test3" + userId;
    }

    @PostMapping("/user/test4")
    public String test4(String userId){

        return "test4" + userId;
    }

    @PostMapping("/cache/update")
    public String update(){
        shiroService.updatePermission();
        return "success";
    }

}
