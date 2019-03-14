package com.csiit3.demo.controller;

import com.csiit3.demo.dao.BookStoreDao;
import com.csiit3.demo.model.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookStoreController {

    @Autowired
    BookStoreDao bookStoreDao;
    @RequestMapping("")
    public String bookwelcome(){
        return "bookindex";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "insertbook";
    }

    @RequestMapping("view")
    public String view(){
        return "viewbyauthor";
    }

    @RequestMapping("viewall")
    public String viewAll(Model model){
        List<BookStore> bookStores=(List<BookStore>)bookStoreDao.getAll();
        model.addAttribute("booklist",bookStores);
        return "viewall";
    }
    @RequestMapping("insertRecord")
    public String insertBook(@RequestParam String bookName,
                             @RequestParam String bookTitle,
                             @RequestParam String bookAuthor,
                             @RequestParam String pages,
                             Model model){
        BookStore bookStore=new BookStore(bookName,bookTitle,bookAuthor,pages);
        bookStoreDao.insert(bookStore);
        return "redirect:viewall";
    }
}
