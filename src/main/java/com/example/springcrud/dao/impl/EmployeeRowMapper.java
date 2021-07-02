package com.example.springcrud.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.springcrud.model.Employee;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt("employee_Id"));
        employee.setEmployeeName(rs.getString("employee_Id"));
        employee.setEmail(rs.getString("email"));
        employee.setGender(rs.getString("gender"));
        employee.setSalary(rs.getDouble("salary"));
        return employee;
    }
}
