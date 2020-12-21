package com.stu.web;

import com.stu.ssm.controller.UserController;

public class test {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        userController.findAll();
    }
}
