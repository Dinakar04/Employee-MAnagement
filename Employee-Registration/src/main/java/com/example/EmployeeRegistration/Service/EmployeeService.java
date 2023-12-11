package com.example.EmployeeRegistration.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.EmployeeRegistration.Entity.Employee;
import com.example.EmployeeRegistration.Repositary.EmployeeRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeService{


    @Autowired
    EmployeeRepo empRepo;

    public List<Employee> getAllEmployee(){
        return empRepo.findAll();
    }

    public Optional<Employee> getById(Integer empId){
        return empRepo.findById(empId);
    }

    public Employee addEmployee(Employee employee){
        return empRepo.save(employee);
    }
    

    public Employee updateEmployee(Integer empId,Employee newEmployee){

        Employee oldEmployee = empRepo.findById(empId)
         .orElseThrow(() -> new EntityNotFoundException("employee not found"));

        BeanUtils.copyProperties(newEmployee, oldEmployee);

        return empRepo.save(oldEmployee);
        
    }
    

    public ResponseEntity<String> deleteEmployee(Integer employeeId) {
        if (empRepo.existsById(employeeId)) {
            empRepo.deleteById(employeeId);
            return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Employee not found with id: " + employeeId, HttpStatus.NOT_FOUND);
        }
    }


}