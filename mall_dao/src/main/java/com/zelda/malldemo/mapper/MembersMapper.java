package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Members;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface MembersMapper {

    @Select("select * from member")
    @Results(id = "memberMap", value = {
            @Result(column = "id", property = "ordersList",
            many = @Many(select = "com.zelda.malldemo.mapper.OrdersMapper.findByMid", fetchType = FetchType.LAZY))
    })
    List<Members> findAll();

    @Select("select * from member where id = #{mid}")
    @ResultMap("memberMap")
    Members findById(String mid);
}
