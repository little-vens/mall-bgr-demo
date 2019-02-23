package com.zelda.malldemo.service.impl;

import com.zelda.malldemo.mapper.OrdersMapper;
import com.zelda.malldemo.pojo.Orders;
import com.zelda.malldemo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper om;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Orders> findAll() {
        return om.findAll();
    }
}
