package com.stu.ssm;

import com.stu.ssm.domain.User;
import com.stu.ssm.service.IUserService;
import com.stu.ssm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class test {

    public static void main(String[] args) throws Exception {
        UserServiceImpl userService = new UserServiceImpl();
        List<User> all = userService.findAll();
        System.out.println(all);

    }
}
