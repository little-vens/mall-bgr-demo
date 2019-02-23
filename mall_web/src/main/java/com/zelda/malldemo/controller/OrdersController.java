package com.zelda.malldemo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zelda.malldemo.pojo.Orders;
import com.zelda.malldemo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService os;

//    查询所有 未分页
//    @RequestMapping("/findAll")
//    public String findAll(Model model) throws Exception{
//        List<Orders> ordersList = os.findAll();
//        model.addAttribute("ordersList", ordersList);
//        return "orders-list";
//    }

    /**
     * 分页查询功能
     * @param model
     * @param pageSize
     * @param pageNum
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll")
    public String findAllByPage(Model model, @RequestParam(name = "pageSize",defaultValue = "5") int pageSize,
                                @RequestParam(name = "pageNum", defaultValue = "1") int pageNum) throws Exception{
        PageInfo<Orders> pageInfo = new PageInfo<Orders>(os.findAllByPage(pageNum,pageSize));
        model.addAttribute("pageInfo", pageInfo);
        return "orders-list";
    }

    /**
     * 详情查询功能
     * @param model
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/findById")
    public String findById(Model model, String id) throws Exception{
        Orders orders = os.findById(id);
        model.addAttribute("orders", orders);
        return "orders-show";
    }
}
