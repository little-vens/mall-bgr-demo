package com.zelda.malldemo.controller;

import com.zelda.malldemo.pojo.Orders;
import com.zelda.malldemo.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    private OrdersService os;

    /**
     * 查询所有
     * @param model 存储orders的集合
     * @return "orders-list.jsp"
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Orders> ordersList = os.findAll();
        model.addAttribute("ordersList", ordersList);
        return "orders-list";
    }
}
