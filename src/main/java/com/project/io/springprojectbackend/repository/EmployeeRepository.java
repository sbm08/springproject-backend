package com.project.io.springprojectbackend.repository;

import com.project.io.springprojectbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository <Employee,Long> {
    // All crud database methods
}


