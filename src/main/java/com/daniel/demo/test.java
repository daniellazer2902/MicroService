package com.daniel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class test {
    @GetMapping (value="/")
    public String hello() {
        return "hello";
    }
}