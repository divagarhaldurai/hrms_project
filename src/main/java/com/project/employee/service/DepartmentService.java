package com.project.employee.service;

import com.project.employee.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartmentList();

    Department saveDepartment(Department department);

    Department getDepartmentById(Integer id);

    Department updateDepartment(Integer id, Department department);

    void deleteDepartment(Integer id);
}
