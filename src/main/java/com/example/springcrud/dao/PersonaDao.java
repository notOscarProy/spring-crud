package com.example.springcrud.dao;

import java.util.List;

import com.example.springcrud.model.Persona;

public interface PersonaDao {
    public abstract void crearPersona(Persona persona);
    public abstract Persona fetchPersonaById(Integer personaId);
    public abstract List<Persona> fetchPersonas();
    public abstract void updateNombrePersonaById(String newEmail, Integer personaId);
    public abstract void deletePersonaById(Integer personaId);
}
