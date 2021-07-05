package com.example.springcrud;

import com.example.springcrud.dao.PersonaDao;
import com.example.springcrud.model.Persona;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class SpringCrudApplicationTests {

	@Test
	void contextLoads() {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCrudApplication.class);

		PersonaDao personaDao = applicationContext.getBean(PersonaDao.class);
		
		Persona persona = new Persona();
		persona.setNombre_persona("OSCAR");
		persona.setEmail_persona("oscar@gmail.com");
		persona.setGenero_persona("masculino");
		persona.setEdad_persona(24);

		personaDao.crearPersona(persona);
		personaDao.updateNombrePersonaById("ALFREDO", 1);
		personaDao.deletePersonaById(1);
		personaDao.fetchPersonas().forEach(System.out::println);;
	}

}
