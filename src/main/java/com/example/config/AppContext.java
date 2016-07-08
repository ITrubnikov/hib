package com.example.config;


import com.example.dao.BookDAO;
import com.example.dao.BookDAOimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public BookDAO bookDAO() {
        return new BookDAOimpl();
    }
}
