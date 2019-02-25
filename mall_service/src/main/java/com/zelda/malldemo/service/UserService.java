package com.zelda.malldemo.service;

import com.zelda.malldemo.pojo.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface UserService extends UserDetailsService {

    /**
     * 分页查询
     * @param num
     * @param size
     * @return
     * @throws Exception
     */
    List<UserInfo> findAll(int num, int size) throws Exception;

    UserInfo findById(String userId) throws Exception;

    UserInfo findByEmail(String email) throws Exception;

    void save(UserInfo user) throws Exception;
}
