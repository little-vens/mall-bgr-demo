package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.Orders;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface OrdersService {

//    /**
//     * 查询所有
//     * @return
//     * @throws Exception
//     */
//    List<Orders> findAll() throws Exception;

    /**
     * 分页查询
     * @param pageSize
     * @param pageNum
     * @return
     * @throws Exception
     */
    List<Orders> findAllByPage(int pageNum, int pageSize) throws Exception;

    /**
     * 根据id查询单行记录
     * @param id
     * @return
     */
    Orders findById(String id) throws Exception;
}
