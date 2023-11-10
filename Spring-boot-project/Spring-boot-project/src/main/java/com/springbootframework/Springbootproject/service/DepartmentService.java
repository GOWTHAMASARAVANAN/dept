package com.springbootframework.Springbootproject.service;

import com.springbootframework.Springbootproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department) ;

    public List<Department> fetchDepartmentList();

    public Department fetchdepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
