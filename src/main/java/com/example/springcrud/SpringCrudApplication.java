package com.example.springcrud;

import com.example.springcrud.dao.EmployeeDao;
import com.example.springcrud.model.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCrudApplication.class, args);

		EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);
		employeeDao.createEmployee(getEmployee());
	}

	private static Employee getEmployee(){
		Employee employee = new Employee();
		employee.setEmployeeName("SEAN");
		employee.setEmail("sean.cs@gmail.com");
		employee.setGender("Male");
		employee.setSalary(9999.00);
		return employee;
	}

}
