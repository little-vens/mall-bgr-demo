package com.zelda.malldemo.test;

import com.zelda.malldemo.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-service.xml")
public class TestService {
    @Autowired
    private ProductService ps;

    /**
     * 测试查询所有功能
     */
    @Test
    public void testFindAll(){
        System.out.println(ps.findAll());
    }
}
