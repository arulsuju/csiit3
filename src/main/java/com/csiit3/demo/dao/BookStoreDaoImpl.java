package com.csiit3.demo.dao;

import com.csiit3.demo.model.BookStore;
import com.csiit3.demo.repo.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreDaoImpl implements BookStoreDao {

    @Autowired
    BookStoreRepository bookStoreRepository;

    @Override
    public Iterable<BookStore> getAll() {
        return bookStoreRepository.findAll();
    }

    @Override
    public BookStore getByAuthor(String author) {
        return bookStoreRepository.findAllByBookAuthor(author);
    }

    @Override
    public void insert(BookStore bookStore) {
        bookStoreRepository.save(bookStore);
    }
}
