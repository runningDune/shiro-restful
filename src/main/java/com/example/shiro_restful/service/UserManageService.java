package com.example.shiro_restful.service;

import com.example.shiro_restful.mapper.UserRoleMapper;
import com.example.shiro_restful.model.User;
import com.example.shiro_restful.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserManageService {



    public List<UserRole> getUserRoles(Integer userId);

    public User getUserInfoById(Integer userId);

    public User getUserInfoByName(String userName);
}
