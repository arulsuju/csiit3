package com.csiit3.demo.rest;

import com.csiit3.demo.dao.BookStoreDao;
import com.csiit3.demo.model.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookrest")
public class BookStoreRestController {

    @Autowired
    BookStoreDao bookStoreDao;


    @GetMapping("viewall")
    public List<BookStore> viewAll(Model model){
        List<BookStore> bookStores=(List<BookStore>)bookStoreDao.getAll();
        return bookStores;
    }

}
