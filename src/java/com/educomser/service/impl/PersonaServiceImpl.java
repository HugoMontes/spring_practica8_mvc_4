/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.service.impl;

import com.educomser.model.Persona;
import com.educomser.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author alumno
 */
@Service("personaService")
public class PersonaServiceImpl implements PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> lista=new ArrayList<Persona>();
        lista.add(new Persona("111","Juan",45));
        lista.add(new Persona("222","Mateo",62));
        lista.add(new Persona("333","Marcos",29));
        lista.add(new Persona("444","Lucas",10));
        return lista;
    }
    
}
