package com.yzxb.SpringSecurity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello Spring Security";
    }
}
