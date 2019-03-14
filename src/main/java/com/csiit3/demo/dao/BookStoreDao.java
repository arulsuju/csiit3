package com.csiit3.demo.dao;

import com.csiit3.demo.model.BookStore;

public interface BookStoreDao {

    public Iterable<BookStore> getAll();
    public BookStore getByAuthor(String author);
    public void insert(BookStore bookStore);

}
