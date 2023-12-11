package com.example.EmployeeRegistration.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRegistration.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    Employee findByFirstName(String empName);
}