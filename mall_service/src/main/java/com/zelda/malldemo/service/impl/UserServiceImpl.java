package com.zelda.malldemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zelda.malldemo.mapper.UserInfoMapper;
import com.zelda.malldemo.pojo.Role;
import com.zelda.malldemo.pojo.UserInfo;
import com.zelda.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Service("userInfoService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper uim;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo userInfo = null;
        try {
            userInfo = uim.selectByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = new User(userInfo.getUsername(), "{noop}" + userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthorities(userInfo.getRoles()));
        return user;
    }

    List<SimpleGrantedAuthority> getAuthorities(List<Role> roles) {
        List<SimpleGrantedAuthority> authorities = new ArrayList();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return authorities;
    }

    public List<UserInfo> findAll(int num,int size) throws Exception {
        PageHelper.startPage(num,size);
        return uim.selectAll();
    }

    @Override
    public UserInfo findById(String userId) throws Exception {
        return uim.selectById(userId);

    }

    @Override
    public UserInfo findByEmail(String email) throws Exception {
        return uim.selectByEmail(email);
    }

    @Override
    public void save(UserInfo user) throws Exception {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        uim.insert(user);
    }
}
