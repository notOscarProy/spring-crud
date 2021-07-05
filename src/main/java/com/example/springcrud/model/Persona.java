package com.example.springcrud.model;

public class Persona {
    private Integer id_persona;
    private String nombre_persona;
    private String email_persona;
    private String genero_persona;
    private Integer edad_persona;    

    public Integer getId_persona() {
        return id_persona;
    }



    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }



    public String getNombre_persona() {
        return nombre_persona;
    }



    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }



    public String getEmail_persona() {
        return email_persona;
    }



    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }



    public String getGenero_persona() {
        return genero_persona;
    }



    public void setGenero_persona(String genero_persona) {
        this.genero_persona = genero_persona;
    }



    public Integer getEdad_persona() {
        return edad_persona;
    }



    public void setEdad_persona(Integer edad_persona) {
        this.edad_persona = edad_persona;
    }



    @Override
    public String toString() {
        return "Persona [id_persona=" + id_persona + ",nombre_persona=" + nombre_persona + ",email_persona=" + email_persona + ",genero_persona="
                + genero_persona + ",edad_persona=" + edad_persona + "]";
    }
}
