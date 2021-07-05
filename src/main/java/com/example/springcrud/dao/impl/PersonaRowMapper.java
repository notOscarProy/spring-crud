package com.example.springcrud.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.springcrud.model.Persona;

import org.springframework.jdbc.core.RowMapper;

public class PersonaRowMapper implements RowMapper<Persona>{
    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException{
        Persona persona = new Persona();
        persona.setId_persona(rs.getInt("id_persona"));
        persona.setNombre_persona(rs.getString("nombre_persona"));
        persona.setEmail_persona(rs.getString("email_persona"));
        persona.setGenero_persona(rs.getString("genero_persona"));
        persona.setEdad_persona(rs.getInt("edad_persona"));
        return persona;
    }
}
