package com.stu.ssm.dao;

import com.stu.ssm.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IBookDao {
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    @Select("select * from book")
    List<Book> findAll() throws Exception;

    @Insert("insert into book(bookId,bookName,bookKind,bookBrith)" +
            "values(#{bookId},#{bookName},#{bookKind},#{bookBrith})")
    void save(Book book);

    @Delete("delete from book where bookId = #{bookId}")
    void delete(int bookId);

    @Update("update book set bookId = #{bookId},bookName = #{bookName}," +
            "bookKind = #{bookKind},bookBrith=#{bookBrith} " +
            "where bookId = #{bookId}")
    void update(Book book);
}
