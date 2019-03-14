package com.csiit3.demo.repo;

import com.csiit3.demo.model.BookStore;
import org.springframework.data.repository.CrudRepository;



public interface BookStoreRepository extends CrudRepository<BookStore,Long> {
    public BookStore findAllByBookAuthor(String author);


}
