package com.zelda.malldemo.pojo;

import lombok.ToString;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@ToString
public class Role {
    /*
    * id varchar2 无意义，主键uuid
roleName varchar2 角色名
roleDesc varchar2 角色描述*/
    private String id;
    private String roleName;
    private String roleDesc;
    private List<UserInfo> userInfoList;
    private List<Permission> permissions;


    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
