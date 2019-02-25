package com.zelda.malldemo.service.impl;

import com.zelda.malldemo.mapper.RoleMapper;
import com.zelda.malldemo.pojo.Role;
import com.zelda.malldemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper rm;

    /**
     * 查询所有
     * @return
     * @throws Exception
     */
    public List<Role> findAll() throws Exception {
        return rm.selectAll();
    }
}
