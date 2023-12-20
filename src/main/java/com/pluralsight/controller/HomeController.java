package com.pluralsight.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping(value="/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping(value="/country")
    public String country(String country){
        return "Hello "+ country + "!";
    }
}
