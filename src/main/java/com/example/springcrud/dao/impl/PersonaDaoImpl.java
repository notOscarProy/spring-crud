package com.example.springcrud.dao.impl;

import java.util.List;

import com.example.springcrud.dao.PersonaDao;
import com.example.springcrud.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void crearPersona(Persona persona) {
        String SQL = "INSERT INTO persona_table(nombre_persona,email_persona,genero_persona,edad_persona) VALUES (?,?,?,?)";
        int update = getJdbcTemplate().update(SQL, persona.getNombre_persona(), persona.getEmail_persona(),
                persona.getGenero_persona(), persona.getEdad_persona());
        if(update==1){
            System.out.println("Persona creada...");
        }
    }

    @Override
    public Persona fetchPersonaById(Integer personaId){
        String SQL = "SELECT * FROM persona_table WHERE id_persona=?";
        return getJdbcTemplate().queryForObject(SQL, new PersonaRowMapper(),personaId);
    }

    @Override
    public List<Persona> fetchPersonas(){
        String SQL = "SELECT * FROM persona_table";
        return getJdbcTemplate().query(SQL, new PersonaRowMapper());
    }

    @Override
    public void updateNombrePersonaById(String nombre, Integer personaId){
        String SQL = "UPDATE persona_table set nombre_persona = ? WHERE id_persona = ?";
        int update = getJdbcTemplate().update(SQL, nombre,personaId);
        if(update==1){
            System.out.println("Nombre actualizado de la persona con ID = "+personaId);
        }
    }

    @Override
    public void deletePersonaById(Integer personaId) {
        String SQL = "DELETE FROM persona_table WHERE id_persona=?";
        int update = getJdbcTemplate().update(SQL,personaId);
        if(update==1){
            System.out.println("Persona borrada con ID = "+personaId);
        }
    }
}
