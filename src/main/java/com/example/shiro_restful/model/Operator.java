package com.example.shiro_restful.model;

import java.util.Date;
import javax.persistence.*;

public class Operator {
    /**
     * 菜单 ID
     */
    @Id
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 所属菜单 ID
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 资源名称
     */
    @Column(name = "operator_name")
    private String operatorName;

    /**
     * 资源 URL
     */
    private String url;

    /**
     * 权限标识符
     */
    private String perms;

    /**
     * 资源需要的 HTTP 请求方法
     */
    @Column(name = "http_method")
    private String httpMethod;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "my_url")
    private String myUrl;

    private Boolean available;

    /**
     * 获取菜单 ID
     *
     * @return operator_id - 菜单 ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置菜单 ID
     *
     * @param operatorId 菜单 ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取所属菜单 ID
     *
     * @return menu_id - 所属菜单 ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置所属菜单 ID
     *
     * @param menuId 所属菜单 ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取资源名称
     *
     * @return operator_name - 资源名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置资源名称
     *
     * @param operatorName 资源名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取资源 URL
     *
     * @return url - 资源 URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源 URL
     *
     * @param url 资源 URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取权限标识符
     *
     * @return perms - 权限标识符
     */
    public String getPerms() {
        return perms;
    }

    /**
     * 设置权限标识符
     *
     * @param perms 权限标识符
     */
    public void setPerms(String perms) {
        this.perms = perms;
    }

    /**
     * 获取资源需要的 HTTP 请求方法
     *
     * @return http_method - 资源需要的 HTTP 请求方法
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * 设置资源需要的 HTTP 请求方法
     *
     * @param httpMethod 资源需要的 HTTP 请求方法
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return my_url
     */
    public String getMyUrl() {
        return myUrl;
    }

    /**
     * @param myUrl
     */
    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }

    /**
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}