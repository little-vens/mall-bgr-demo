package com.zelda.malldemo.test;

import com.zelda.malldemo.mapper.PermissionMapper;
import com.zelda.malldemo.mapper.RoleMapper;
import com.zelda.malldemo.pojo.Permission;
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
@ContextConfiguration("classpath*:spring/spring*")
public class TestPermission {

    @Autowired
    private PermissionMapper pm;

    @Autowired
    private RoleMapper rm;

    @Test
    public void testFind() throws Exception {
       // System.out.println(pm.selectByRid("4FAB90189CFD45C8BFEF60CF45EF3CCB"));
        System.out.println(rm.selectAll());
    }
}
