package com.example.springcrud;

import com.example.springcrud.dao.EmployeeDao;
import com.example.springcrud.model.Employee;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class SpringCrudApplicationTests {

	@Test
	void contextLoads() {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCrudApplication.class);

		EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);
		Employee employee = employeeDao.fetchEmployeeById(1);
		System.out.println(employee);
	}

}
