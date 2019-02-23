package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Orders;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface OrdersMapper {

    @Select("select * from orders")
    @Results(id = "ordersMap", value = {
            @Result(id = true,column = "id", property = "id"),
            @Result(column = "productid", property = "product",
                    one = @One(select = "com.zelda.malldemo.mapper.ProductMapper.findById", fetchType = FetchType.LAZY)),
            @Result(column = "memberid", property = "members",
                    one = @One(select = "com.zelda.malldemo.mapper.MembersMapper.findById", fetchType = FetchType.LAZY)),
            @Result(column = "id", property = "travellers",
                    many = @Many(select = "com.zelda.malldemo.mapper.TravellerMapper.findByOid", fetchType = FetchType.LAZY)
            )
    })
    List<Orders> findAll();

    @Select("select * from orders where id = #{oid}")
    @ResultMap("ordersMap")
    Orders findById(String oid);

    @Select("select * from orders where memberid=#{mid}")
    List<Orders> findByMid(String mid);

    @Select("SELECT * FROM orders o, order_traveller ot WHERE  o.id = ot.id AND ot.travellerid = #{tid}")
    List<Orders> findByTid(String tid);

}
