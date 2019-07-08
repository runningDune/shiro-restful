package com.example.shiro_restful.service.impl;

import com.example.shiro_restful.mapper.UserMapper;
import com.example.shiro_restful.mapper.UserRoleMapper;
import com.example.shiro_restful.model.User;
import com.example.shiro_restful.model.UserRole;
import com.example.shiro_restful.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserRole> getUserRoles(Integer userId) {

        Example example = new Example(UserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        criteria.andEqualTo("available", true);
        return userRoleMapper.selectByExample(example);
    }

    @Override
    public User getUserInfoById(Integer userId) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", userId);
        criteria.andEqualTo("available", true);
        List<User> users = userMapper.selectByExample(example);
        return users!=null && users.size() > 0 ?users.get(0):null;
    }

    @Override
    public User getUserInfoByName(String userName) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", userName);
        criteria.andEqualTo("available", true);
        List<User> users = userMapper.selectByExample(example);
        return users!=null && users.size() > 0 ?users.get(0):null;
    }
}
