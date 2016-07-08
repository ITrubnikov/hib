package com.example.dao;

import com.example.model.Book;

import java.util.List;

/**
 * Created by iatru_000 on 08.07.2016.
 */
public interface BookDAO {
    List<Book> getAll();
    Book getById (long id);
    String insertToTable(Book book);
}
