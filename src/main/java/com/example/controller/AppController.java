package com.example.controller;

import com.example.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {
    @Autowired
    BookDAO bookDAO;

    @RequestMapping(value = {"/", "/home"})
    public String home(Model model) {
        model.addAttribute("USD", "USD");
        return "home";
    }

    @RequestMapping("/home")
    public String ShowAllBookGet(Model model) {
        model.addAttribute("book", this.bookDAO.getAll());
        return "home";
    }
}