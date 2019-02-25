package com.zelda.malldemo.pojo;

import lombok.ToString;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
public class UserInfo {
    /*
        id varchar2 无意义，主键uuid
        email varchar2 非空，唯一
        username varchar2 用户名
        password varchar2 密码（加密）
        phoneNum varchar2 电话
        status int 状态0 未开启 1 开启
     */
    private String id;
    private String email;
    private String username;
    private String password;
    private String phoneNum;
    private Integer status;
    private String statusStr;
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        this.setStatusStr(status == 0 ? "未开启" : "开启");
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }
}
