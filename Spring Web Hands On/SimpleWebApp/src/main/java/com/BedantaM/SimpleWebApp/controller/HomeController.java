package com.BedantaM.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
    return "Welcome Home Everyone";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about section..";
    }
}
