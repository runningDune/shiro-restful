package com.example.shiro_restful.mapper;

import com.example.shiro_restful.model.Operator;
import com.example.shiro_restful.utils.MyMapper;


import java.util.HashMap;
import java.util.List;

public interface OperatorMapperCustom  extends MyMapper<Operator> {

    List<Operator> getOperatorListByRoleId(HashMap map);
}
