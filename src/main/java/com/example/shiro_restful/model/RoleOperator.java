package com.example.shiro_restful.model;

import javax.persistence.*;

@Table(name = "role_operator")
public class RoleOperator {
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "operator_id")
    private Integer operatorId;

    private Boolean available;

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return operator_id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}