package com.stu.ssm.controller;

import com.stu.ssm.domain.Book;
import com.stu.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    public IBookService bookService;

    @RequestMapping("update.do")
    public String update(Book book){
        System.out.println("controller!!!");
        bookService.update(book);
        return "redirect:findAll.do";
    }

    /**
     * 用户删除
     * @param bookId
     * @return
     */
    @RequestMapping("delete.do")
    public String delete(int bookId){
        bookService.delete(bookId);
        return "redirect:findAll.do";
    }

    /**
     * 产品添加
     * @param book
     */
    @RequestMapping(value = "/save.do", produces = "text/plain;charset=UTF-8")
    public String save(Book book){
        //System.out.println(book);
        bookService.save(book);
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

        List<Book> us = bookService.findAll();
//        for (User u: us) {
//            System.out.println(u);
//        }
        mv.addObject("bookList",us);
        mv.setViewName("BookList");
        return mv;
    }
}
