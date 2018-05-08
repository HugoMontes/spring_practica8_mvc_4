/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.persistence;

import com.educomser.model.Estudiante;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author alumno
 */
public interface EstudianteDao {
    public void setDataSource(DataSource ds);
    public void save(Estudiante estudiante);
    public void delete(int id);
    public void update(Estudiante estudiante);
    public Estudiante findById(int id);
    public List<Estudiante> findAll();
}
