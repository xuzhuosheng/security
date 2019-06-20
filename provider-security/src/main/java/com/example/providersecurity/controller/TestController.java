package com.example.providersecurity.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/toTest")
    public String toTest() {
        return "this is test controller";
    }
}
