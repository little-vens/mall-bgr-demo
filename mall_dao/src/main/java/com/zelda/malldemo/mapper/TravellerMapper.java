package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface TravellerMapper {

    @Select("select t.* from traveller t inner join order_traveller ot on t.id = ot.travellerid and ot.orderid = #{oid}")
    List<Traveller> findByOid(String oid);
}
