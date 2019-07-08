package com.example.shiro_restful.service;

import com.example.shiro_restful.model.Operator;
import com.example.shiro_restful.model.RoleOperator;

import java.util.List;

public interface OperatorManageService {

    public List<Operator> getOperatorByRoleId(Integer roleId);
}
