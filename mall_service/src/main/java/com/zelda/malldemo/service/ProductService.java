package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface ProductService {
    /**
     * 查询所有
     * @return
     */
    List<Product> findAll();

    /**
     * 查询单行记录
     * @param pid
     * @return
     */
    Product findById(String pid);
}
