package com.example.comsumersecurity.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.comsumersecurity.security.MyUserDetailsService;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {


    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("to login");
        return "/login";
    }


    @RequestMapping (value = "/doLogin")
    public ModelAndView doLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }

 /*   @RequestMapping (value = "/index")
    @ResponseBody
    @PreAuthorize ("hasRole('ADMIN')")
    public String index() {
        System.out.println("to index");
        JSONObject object = new JSONObject();
        object.put("status", true);
        return object.toJSONString();
    }*/

    @RequestMapping (value = "/index")
    public String index() {
        System.out.println("index");
        return "index";
    }

    @RequestMapping (value = "/index1")
    public String index1() {
        System.out.println("index1");
        return "index1";
    }

    @RequestMapping ("/fail")
    @ResponseBody
    public String fail(Model model) {
        System.out.println("to fail");
        JSONObject object = new JSONObject();
        object.put("status", false);
        return object.toJSONString();
    }
}

