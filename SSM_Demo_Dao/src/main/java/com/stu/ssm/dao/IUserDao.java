package com.stu.ssm.dao;

import com.stu.ssm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    @Select("select * from user")
    public List<User> findAll() throws Exception;
}
