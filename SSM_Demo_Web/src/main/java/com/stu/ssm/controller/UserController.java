package com.stu.ssm.controller;

import com.stu.ssm.domain.User;
import com.stu.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        System.out.println("controller!!!!");

        List<User> us = userService.findAll();
        for (User u: us) {
            System.out.println(u);
        }
        mv.addObject("userList",us);
        mv.setViewName("UserList");
        return mv;
    }
}
