package com.stu.ssm.service.impl;

import com.stu.ssm.dao.IBookDao;
import com.stu.ssm.domain.Book;
import com.stu.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> findAll() throws Exception {
        return bookDao.findAll();
    }

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public void delete(int bookId) {
        bookDao.delete(bookId);
    }

    @Override
    public void update(Book book) {
        System.out.println("service!!!");
        bookDao.update(book);
    }
}
