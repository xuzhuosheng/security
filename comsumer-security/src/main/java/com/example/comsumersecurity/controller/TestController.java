package com.example.comsumersecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/page")
public class TestController {

//    @RequestMapping(value = "/toLogin")
//    public ModelAndView toLogin() {
//        ModelAndView view = new ModelAndView();
//        view.setViewName("login");
//        return view;
//    }


    @RequestMapping (value = "/book")
    public ModelAndView book() {
        System.out.println("to book");
        ModelAndView view = new ModelAndView();
        view.setViewName("book");
        return view;
    }
}
