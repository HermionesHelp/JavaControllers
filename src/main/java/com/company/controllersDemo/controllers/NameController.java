package com.company.controllersDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/name")
public class NameController {

    private static String name = "Edna";

    // GET http://localhost:8080/name
    @GetMapping
    @ResponseBody
    public String getName(){
        return "Hello " + name + "!";
    }

    // POST http://localhost:8080/name?n=Fred
    // this actually overwrites the static variable above with whatever query parameter is passed in.
    @PostMapping
    @ResponseBody
    public String postName(@RequestParam String n){
        name = n;
        return "Ok";
    }

    // POST /name/{name} http://localhost:8080/name/George
    @PostMapping(value = "/{theName}")
    @ResponseBody
    public String postNamePathVariable(@PathVariable String theName) {
        name = theName;
        return "OK";
    }

    // GET /name/form  http://localhost:8080/name/form
    @GetMapping(value = "/form")
    @ResponseBody
    public String getNameForm() {
        String formString = "<html><form method=\"post\">";
        formString += "<label for=\"n\">Name: <input type=\"text\" id=\"n\" name=\"n\"></label>";
        formString += "<input type=\"submit\">";
        formString += "</form></html>";
        return formString;
    }

    // POST /name/form
    @PostMapping(value = "/form")
    @ResponseBody
    public String postNameForm(@RequestParam String n) {
        name = n;
        return "OK";
    }
}
