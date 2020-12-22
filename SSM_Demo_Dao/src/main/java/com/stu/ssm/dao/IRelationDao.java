package com.stu.ssm.dao;

import com.stu.ssm.domain.Book;
import com.stu.ssm.domain.Relation;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRelationDao {
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    @Select("select * from relation")
    List<Relation> findAll() throws Exception;

    @Insert("insert into relation(userId,bookId,userName,bookName)" +
            "values(#{userId},#{bookId},#{userName},#{bookName})")
    void save(Relation relation);

    @Delete("delete from relation where userId=#{userId} and bookId=#{bookId}")
    void delete(@Param("userId")int userId, @Param("bookId")int bookId);

//    @Update("update relation set useId = #{userId},bookId = #{bookId}," +
//            "userName = #{userName},bookName=#{bookName} " +
//            "where userId = #{userId} and bookId = #{bookId}")
//    void update(Relation relation);
}
