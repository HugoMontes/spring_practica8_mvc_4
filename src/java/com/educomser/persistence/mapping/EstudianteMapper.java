/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.persistence.mapping;

import com.educomser.model.Estudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



/**
 *
 * @author alumno
 */
public class EstudianteMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Estudiante estudiante=new Estudiante();
        estudiante.setId(rs.getInt("id"));
        estudiante.setNombre(rs.getString("nombre"));
        estudiante.setEdad(rs.getInt("edad"));
        return estudiante;
    }
    
}
