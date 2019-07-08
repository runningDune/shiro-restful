package com.example.shiro_restful.service.impl;

import com.example.shiro_restful.mapper.OperatorMapperCustom;
import com.example.shiro_restful.mapper.RoleOperatorMapper;
import com.example.shiro_restful.model.Operator;
import com.example.shiro_restful.model.RoleOperator;
import com.example.shiro_restful.service.OperatorManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;

@Service
public class OperatorManageServiceImpl implements OperatorManageService {

    @Autowired
    private OperatorMapperCustom operatorMapperCustom;

    @Override
    public List<Operator> getOperatorByRoleId(Integer roleId) {

        HashMap params = new HashMap();
        params.put("roleId",roleId);
        return operatorMapperCustom.getOperatorListByRoleId(params);
    }
}
