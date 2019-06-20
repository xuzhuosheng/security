package com.example.comsumersecurity.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {

    @RequestMapping("/Test")
    public String Test() {
        return "Test";
    }
}
