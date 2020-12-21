package com.stu.ssm.dao;

import com.stu.ssm.domain.User;
import org.apache.ibatis.annotations.Insert;
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

    @Insert("insert into user(userId,userName,userAge,userClass,userHome)" +
            "values(#{userId},#{userName},#{userAge},#{userClass},#{userHome})")
    void save(User user);
}
