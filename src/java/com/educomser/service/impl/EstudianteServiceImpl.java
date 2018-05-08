/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.service.impl;

import com.educomser.model.Estudiante;
import com.educomser.persistence.EstudianteDao;
import com.educomser.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author alumno
 */
@Service("estudianteService")
public class EstudianteServiceImpl implements EstudianteService{
    
    @Autowired
    @Qualifier("estudianteDao")
    private EstudianteDao estudianteDao;

    @Override
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteDao.findAll();
    }
    
}
