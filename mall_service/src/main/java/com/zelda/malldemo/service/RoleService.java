package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.Role;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface RoleService {

    /**
     * 查询所有
     * @return
     * @throws Exception
     */
    List<Role> findAll() throws Exception;
}
