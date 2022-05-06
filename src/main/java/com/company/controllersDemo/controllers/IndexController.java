package com.company.controllersDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    @ResponseBody
    // GET request route: http://localhost:8080
    public String getIndex(){
        return "<h1> GET Index </h1>";
    }

    @PostMapping
    @ResponseBody
    // POST request route: http://localhost:8080
    public String postIndex(){
        return "This is the POST Index.";
    }
}
