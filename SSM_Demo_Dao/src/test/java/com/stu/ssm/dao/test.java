package com.stu.ssm.dao;

import com.stu.ssm.domain.User;

import java.util.List;

public class test {

private static IUserDao userDao;
    public static void main(String[] args) throws Exception {
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
}
