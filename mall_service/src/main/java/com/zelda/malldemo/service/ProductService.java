package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.Product;

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
    List<Product> findAll() throws Exception;

    /**
     * 查询单行记录
     * @param pid
     * @return
     */
    Product findById(String pid) throws Exception;

    /**
     * 保存记录，保存成功则返回记录的id值
     * @param product
     * @return
     */
    void saveProduct(Product product) throws Exception;
}
