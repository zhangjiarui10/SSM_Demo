package com.stu.ssm.service;

import com.stu.ssm.domain.Book;
import com.stu.ssm.domain.User;

import java.util.List;

public interface IBookService {

    List<Book> findAll() throws Exception;

    void save(Book book);

    void delete(int bookId);

    void update(Book book);
}
