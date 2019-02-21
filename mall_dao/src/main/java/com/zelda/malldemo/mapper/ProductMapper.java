package com.zelda.malldemo.mapper;

import com.zelda.malldemo.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface ProductMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from product")
    List<Product> findAll();

    /**
     * 查询单行记录
     * @param pid
     * @return
     */
    @Select("select * from product where id = #{pid}")
    Product findById(String pid);
}
