package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface RoleMapper {

    /**
     * 根据userId查询所有Role记录
     * @param uid
     * @return
     */
    @Select("select r.* from role r,users_role ur where r.id = ur.roleid and ur.userid = #{uid}")
    @ResultMap("roleMap")
    List<Role> selectByUid(String uid);

    /**
     * 查询所有role
     * @return
     * @throws Exception
     */
    @Select("select * from role")
    @Results(id = "roleMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "rolename",property = "roleName"),
            @Result(column = "roledesc",property = "roleDesc"),
            @Result(column = "id", property = "permissions", javaType = List.class,
            many = @Many(select = "com.zelda.malldemo.mapper.PermissionMapper.selectByRid",fetchType = FetchType.LAZY))
    })
    List<Role> selectAll() throws Exception;
}
