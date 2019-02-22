package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.Orders;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface OrdersService {

    /**
     * 查询所有
     * @return
     */
    List<Orders> findAll();
}
