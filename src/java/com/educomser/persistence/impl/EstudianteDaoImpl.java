/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.persistence.impl;

import com.educomser.model.Estudiante;
import com.educomser.persistence.EstudianteDao;
import com.educomser.persistence.mapping.EstudianteMapper;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alumno
 */
@Repository("estudianteDao")
public class EstudianteDaoImpl implements EstudianteDao {

    
    private DataSource ds;
    private JdbcTemplate jt;

    @Override
    @Autowired
    @Qualifier("dataSource")
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.jt = new JdbcTemplate(ds);
    }

    @Override
    public void save(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, edad) VALUES(?,?)";
        jt.update(sql, estudiante.getNombre(), estudiante.getEdad());
        System.out.println("Registro guardado....");
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM estudiantes WHERE id=?";
        jt.update(sql, id);
        System.out.println("Registro eliminado....");
    }

    @Override
    public void update(Estudiante estudiante) {
        String sql = "UPDATE estudiantes SET nombre=?, edad=? WHERE id=?";
        jt.update(sql, estudiante.getNombre(), estudiante.getEdad(), estudiante.getId());
        System.out.println("Registro actualizado....");
    }

    @Override
    public Estudiante findById(int id) {
        String sql = "SELECT * FROM estudiantes WHERE id=?";
        Estudiante est = (Estudiante) jt.queryForObject(sql, new Object[]{id}, new EstudianteMapper());
        return est;
    }

    @Override
    public List<Estudiante> findAll() {
        String sql = "SELECT * FROM estudiantes";
        List<Estudiante> lista = jt.query(sql, new EstudianteMapper());
        return lista;
    }   
}
