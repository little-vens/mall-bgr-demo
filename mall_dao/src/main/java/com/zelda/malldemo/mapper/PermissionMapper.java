package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Permission;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface PermissionMapper {

    @Select("select p.* from permission p, role_permission rp where p.id = rp.permissionid and rp.roleid=#{rid}")
    @Results(id = "pMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "permissionname",property = "permissionName"),
            @Result(column = "url",property = "url")
    })
    List<Permission> selectByRid(String id) throws Exception;
}
