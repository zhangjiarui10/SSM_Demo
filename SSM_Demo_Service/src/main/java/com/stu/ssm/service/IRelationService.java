package com.stu.ssm.service;

import com.stu.ssm.domain.Book;
import com.stu.ssm.domain.Relation;

import java.util.List;

public interface IRelationService {

    List<Relation> findAll() throws Exception;

    void save(Relation relation);

    void delete(int useId, int bookId);

//    void update(Relation relation);
}
