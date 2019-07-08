package com.example.shiro_restful.shiro;

import com.example.shiro_restful.model.Operator;
import com.example.shiro_restful.model.User;
import com.example.shiro_restful.model.UserRole;
import com.example.shiro_restful.service.OperatorManageService;
import com.example.shiro_restful.service.UserManageService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {



    @Autowired
    private UserManageService userManageService;

    @Autowired
    private OperatorManageService operatorManageService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if(session.getAttribute("authInfo") == null){
            //获取登录用户名
            String username= (String) principalCollection.getPrimaryPrincipal();
            //查询用户名称
            User user = userManageService.getUserInfoByName(username);

            List<UserRole> roles = userManageService.getUserRoles(user.getUserId());
            //添加角色和权限
            SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
            for (UserRole role: roles) {
                //添加角色
                simpleAuthorizationInfo.addRole(role.getRoleId().toString());

                //获取角色下权限
//            List<Operator> operatorsList = operatorManageService.getOperatorByRoleId(role.getRoleId());
//            for (Operator operator : operatorsList) {
//                //添加权限
//                simpleAuthorizationInfo.addStringPermission(operator.getMyUrl());
//            }
                simpleAuthorizationInfo.addStringPermission("11");
                //simpleAuthorizationInfo.addStringPermission("12");
            }
            session.setAttribute("authInfo", simpleAuthorizationInfo);
            return simpleAuthorizationInfo;
        }else{
            return (SimpleAuthorizationInfo)session.getAttribute("authInfo");
        }

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String username = authenticationToken.getPrincipal().toString();
        User user = userManageService.getUserInfoByName(username);
        if (user == null) {
            //这里返回后会报出对应异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, user.getPassword().toString(), getName());
            return simpleAuthenticationInfo;
        }
    }

}
