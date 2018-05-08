/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.controller;

import com.educomser.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alumno
 */
@Controller
@RequestMapping("/estudiante")
public class EstudianteController {
    
    @Autowired
    @Qualifier("estudianteService")
    private EstudianteService estudianteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("estudiante/index");
        mv.addObject("estudiantes", estudianteService.obtenerEstudiantes());
        return mv;
    }
}
