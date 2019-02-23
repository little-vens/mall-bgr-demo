package com.zelda.malldemo.service.impl;

import com.github.pagehelper.PageHelper;
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

//    /**
//     * 查询所有
//     * @return
//     */
//    @Override
//    public List<Orders> findAll() throws Exception {
//        return om.findAll();
//    }

    /**
     * 分页查询
     * @param pageSize 每页显示的条数
     * @param pageNum  当前页码
     * @return
     * @throws Exception
     */
    @Override
    public List<Orders> findAllByPage(int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        return om.findAll();
    }

    /**
     * 根据id查询单行记录
     * @param id
     * @return
     */
    @Override
    public Orders findById(String id) throws Exception {
        return om.findById(id);
    }
}
