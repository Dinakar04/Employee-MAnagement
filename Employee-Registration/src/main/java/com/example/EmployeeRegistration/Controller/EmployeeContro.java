package com.example.EmployeeRegistration.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.EmployeeRegistration.Entity.Employee;
import com.example.EmployeeRegistration.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeContro {

    @Autowired
    private EmployeeService empService;
    

    @GetMapping("/all")
    public List<Employee> allEmployees(){
       return empService.getAllEmployee();
    }

    @PostMapping("/add/emp")
    public Employee addEmployee(@RequestBody Employee employee){
        return empService.addEmployee(employee);

    }

    @PutMapping("update/{empid}")
    public Employee updateEmployee(@PathVariable Integer empid,Employee newEmployee){
        return empService.updateEmployee(empid, newEmployee);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId) {
        return empService.deleteEmployee(empId);
    }
}
