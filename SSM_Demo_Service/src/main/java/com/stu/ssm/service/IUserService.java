package com.stu.ssm.service;

import com.stu.ssm.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll() throws Exception;

    void save(User user);

    void delete(int userId);

    void update(User user);
}
