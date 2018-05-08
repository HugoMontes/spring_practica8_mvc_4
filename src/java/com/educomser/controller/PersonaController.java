package com.educomser.controller;

import com.educomser.model.Persona;
import com.educomser.service.PersonaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    private static final Log LOG = LogFactory.getLog(PersonaController.class);

    @Autowired
    @Qualifier("personaService")
    private PersonaService personaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("persona/index");
        mv.addObject("personas", personaService.listarPersonas());
        return mv;
    }

    @RequestMapping(value = "/detalle1", method = RequestMethod.GET)
    public String detalle1(Model model) {
        Persona persona = new Persona();
        persona.setCi("123456");
        persona.setNombre("Juan Perez");
        persona.setEdad(20);
        model.addAttribute("persona", persona);
        return "persona/detalle";
    }

    @RequestMapping(value = "/detalle2", method = RequestMethod.GET)
    public ModelAndView detalle2() {
        Persona persona = new Persona();
        persona.setCi("777666");
        persona.setNombre("Ana Robles");
        persona.setEdad(59);
        ModelAndView mv = new ModelAndView("persona/detalle");
        mv.addObject(persona);
        return mv;
    }

    // Mostra un formulario
    @RequestMapping(value = "/nuevo", method = RequestMethod.GET)
    public ModelAndView nuevo() {
        ModelAndView mv = new ModelAndView("persona/nuevo", "command", new Persona());
        return mv;
    }

    // Obtener datos del formulario
    @RequestMapping(value = "/mostrar", method = RequestMethod.POST)
    public ModelAndView mostrar(@ModelAttribute("persona") Persona persona) {
        LOG.info("METHOD: mostrar(); PARAMS: " + persona);
        String VIEW = "persona/detalle";
        ModelAndView mv = new ModelAndView(VIEW);
        mv.addObject("persona", persona);
        LOG.info("VIEW: " + VIEW + " ; DATA: " + persona);
        return mv;
    }
}
