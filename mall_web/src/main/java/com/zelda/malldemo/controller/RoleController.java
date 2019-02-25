package com.zelda.malldemo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zelda.malldemo.pojo.Role;
import com.zelda.malldemo.service.RoleService;
import com.zelda.malldemo.service.impl.RoleServiceImpl;
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
@RequestMapping("role")
public class RoleController  {

    @Autowired
    private RoleService rs;

    /**
     * role列表显示
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        List<Role> roles = rs.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("roles",roles);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
