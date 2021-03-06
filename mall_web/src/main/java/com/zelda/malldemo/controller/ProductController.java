package com.zelda.malldemo.controller;

import com.zelda.malldemo.pojo.Product;
import com.zelda.malldemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ps;

    /**
     * 列表展示功能
     * @return
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> products = ps.findAll();
        System.out.println(products.get(0).getProductStatusStr());
        mv.addObject("products", products);
        mv.setViewName("product-list");
        return mv;
    }

    /**
     * 产品保存
     * @param product
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView addProduct(Product product) throws Exception {
        ModelAndView mv = new ModelAndView();
        ps.saveProduct(product);
        mv.setViewName("redirect:findAll");
        return mv;
    }
}
