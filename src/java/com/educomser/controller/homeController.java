package com.educomser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class homeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = "spring", method = RequestMethod.GET)
    public String helloSpring(){
        return "spring_view";
    }
}
