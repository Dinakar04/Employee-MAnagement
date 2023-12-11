package com.example.EmployeeRegistration.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer empId;
    String firstName;
    String lastName;
    String Designation;
    double salary;
    double experiance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;


    public Integer getEmpId() {
        return empId;
    }

    
    // public void setEmpId(int empId) {
    //     this.empId = empId;
    // }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getDesignation() {
        return Designation;
    }


    public void setDesignation(String designation) {
        Designation = designation;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getExperiance() {
        return experiance;
    }


    public void setExperiance(double experiance) {
        this.experiance = experiance;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public Employee(String firstName, String lastName, String designation, double salary, double experiance,
            Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        Designation = designation;
        this.salary = salary;
        this.experiance = experiance;
        this.address = address;
    }


    public Employee() {
    }

    
}
