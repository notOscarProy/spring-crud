package com.example.springcrud;

import com.example.springcrud.dao.PersonaDao;
import com.example.springcrud.model.Persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCrudApplication.class, args);

		PersonaDao personaDao = applicationContext.getBean(PersonaDao.class);
		personaDao.crearPersona(getpersona());
	}

	private static Persona getpersona(){
		Persona persona = new Persona();
		persona.setNombre_persona("OSCAR");
		persona.setEmail_persona("oscar@gmail.com");
		persona.setGenero_persona("masculino");
		persona.setEdad_persona(24);
		return persona;
	}

}
