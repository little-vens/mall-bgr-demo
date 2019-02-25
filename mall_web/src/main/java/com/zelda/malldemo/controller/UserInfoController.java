package com.zelda.malldemo.controller;

import com.github.pagehelper.PageInfo;
import com.zelda.malldemo.pojo.UserInfo;
import com.zelda.malldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserService uis;

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "pageNum",defaultValue = "1",required = false) int num,
                                @RequestParam(name = "pageSize",defaultValue = "5", required = false) int size) throws Exception {
        List<UserInfo> userInfoList = uis.findAll(num,size);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/detail")
    public ModelAndView findById(@RequestParam(name = "id") String userId) throws Exception {
        UserInfo userInfo = uis.findById(userId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",userInfo);
        mv.setViewName("user-show");
        return mv;
    }

    @RequestMapping("/save")
    public String saveUser(Model model, UserInfo user) throws Exception{
        UserInfo userInfo = uis.findByEmail(user.getEmail());
        if (userInfo != null) {
            model.addAttribute("message",user.getEmail()+"邮箱已注册！");
            return "forward:/pages/user-add.jsp";
        }
        uis.save(user);
        return "redirect:findAll";
    }
}
