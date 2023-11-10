package com.springbootframework.Springbootproject.repository;

import com.springbootframework.Springbootproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {



//    @Query(value = "", nativeQuery = true)
    public Department findByDepartmentNameIgnoreCase(String departmentName);


}
