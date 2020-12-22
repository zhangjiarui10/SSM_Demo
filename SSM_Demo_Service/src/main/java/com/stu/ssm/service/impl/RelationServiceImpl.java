package com.stu.ssm.service.impl;

import com.stu.ssm.dao.IRelationDao;
import com.stu.ssm.domain.Relation;
import com.stu.ssm.service.IRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RelationServiceImpl implements IRelationService {

    @Autowired
    private IRelationDao relationDao;

    @Override
    public List<Relation> findAll() throws Exception {
        return relationDao.findAll();
    }

    @Override
    public void save(Relation relation) {
        relationDao.save(relation);
    }

    @Override
    public void delete(int useId, int bookId) {
        System.out.println("srevice!! 删除！！");
        relationDao.delete(useId, bookId);
    }

//    @Override
//    public void update(Relation relation) {
//        relationDao.update(relation);
//    }
}
