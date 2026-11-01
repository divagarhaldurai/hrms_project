package com.project.employee.service;

import com.project.employee.model.Employee;
import java.util.List;


public interface EmployeeService {

     List<Employee> getEmployeeList();

     Employee saveEmployee(Employee employee);

     Employee getEmployeeById(Integer id);

     Employee updateEmployee(Integer id, Employee employee);

     void deleteEmployee(Integer id);
}
