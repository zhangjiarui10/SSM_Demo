package com.stu.ssm.service.impl;

import com.stu.ssm.dao.IUserDao;
import com.stu.ssm.domain.User;
import com.stu.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    public IUserDao userDao;

    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
