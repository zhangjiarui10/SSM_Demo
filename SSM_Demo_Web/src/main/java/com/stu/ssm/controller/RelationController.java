package com.stu.ssm.controller;

import com.stu.ssm.domain.Book;
import com.stu.ssm.domain.Relation;
import com.stu.ssm.service.IBookService;
import com.stu.ssm.service.IRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/relation")
public class RelationController {

    @Autowired
    public IRelationService relationService;

//    @RequestMapping("update.do")
//    public String update(Relation relation){
//        //System.out.println("controller!!!");
//        System.out.println("要修改的！！");
//        System.out.println(relation);
//        relationService.update(relation);
//        return "redirect:findAll.do";
//    }

    /**
     * 用户删除
     * @param userId bookId
     * @return
     */
    @RequestMapping("delete.do")
    public String delete(Integer userId, Integer bookId){
        System.out.println("要删除的！！");
        System.out.println(userId);
        System.out.println(bookId);
        relationService.delete(userId, bookId);
        return "redirect:findAll.do";
    }

    /**
     * 产品添加
     * @param relation
     */
    @RequestMapping(value = "/save.do", produces = "text/plain;charset=UTF-8")
    public String save(Relation relation){
        //System.out.println(book);
        relationService.save(relation);
        return "redirect:findAll.do";
    }

    /**
     * 查询全部user
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        //System.out.println("controller!!!!");

        List<Relation> us = relationService.findAll();
//        for (Relation u: us) {
//            System.out.println(u);
//        }
        mv.addObject("relationList",us);
        mv.setViewName("RelationList");
        return mv;
    }
}
