package com.educomser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/practica")
public class PracticaController {

    // http://localhost:8080/spring_practica8_mvc_4/practica/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "practica/index";
    }

    // http://localhost:8080/spring_practica8_mvc_4/practica/saludo
    @RequestMapping(value = "/saludo", method = RequestMethod.GET)
    public ModelAndView saludo() {
        ModelAndView mv = new ModelAndView("practica/index");
        return mv;
    }

    @RequestMapping(value = "/saludo/nombre", method = RequestMethod.GET)
    public ModelAndView saludoNombre() {
        ModelAndView mv = new ModelAndView("practica/saludo");
        mv.addObject("nombre", "Juan Perez");
        return mv;
    }
    
    @RequestMapping(value = "/parametro1", method = RequestMethod.GET)
    public ModelAndView parametro1(@RequestParam("nom") String nombre){
        ModelAndView mv = new ModelAndView("practica/saludo");
        mv.addObject("nombre", nombre);
        return mv;
    }
    
    @RequestMapping(value = "/parametro2/{nom}", method = RequestMethod.GET)
    public ModelAndView parametro2(@PathVariable("nom") String nombre){
        ModelAndView mv = new ModelAndView("practica/saludo");
        mv.addObject("nombre", nombre);
        return mv;
    }
    
}
