package com.example.dao;

import com.example.model.Book;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iatru_000 on 08.07.2016.
 */
public class BookDAOimpl implements BookDAO {
    @Autowired
    SessionFactory sessionFactory;

    public List<Book> getAll() {
        List<Book> list = new ArrayList<>();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            list=criteria.list();
        }catch (HibernateException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Book getById(long id) {
        return null;
    }

    public String insertToTable(Book book) {
        return null;
    }

    public BookDAOimpl() {
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
