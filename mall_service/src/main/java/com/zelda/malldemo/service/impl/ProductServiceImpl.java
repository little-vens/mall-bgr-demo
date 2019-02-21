package com.zelda.malldemo.service.impl;

import com.zelda.malldemo.mapper.ProductMapper;
import com.zelda.malldemo.pojo.Product;
import com.zelda.malldemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper pm;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Product> findAll() {
        return pm.findAll();
    }

    /**
     * 查询单行记录
     * @param pid
     * @return
     */
    @Override
    public Product findById(String pid) {
        return pm.findById(pid);
    }
}
