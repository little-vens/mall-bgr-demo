package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface UserInfoMapper {

    @Select("select * from users where username = #{username}")
    @Results(id = "userMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "id", property = "roles", javaType = List.class,
            many = @Many(select = "com.zelda.malldemo.mapper.RoleMapper.selectByUid"))
    })
    UserInfo selectByUsername(String username) throws Exception;

    @Select("select * from users")
    @ResultMap("userMap")
    List<UserInfo> selectAll() throws Exception;

    @Select("select * from users where id = #{userId}")
    @ResultMap("userMap")
    UserInfo selectById(String userId) throws Exception;

    @Insert("insert into users (email, username, PASSWORD, phoneNum, STATUS)" +
            "values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void insert(UserInfo user) throws Exception;

    @Select("select * from users where email = #{email}")
    UserInfo selectByEmail(String email) throws Exception;
}
