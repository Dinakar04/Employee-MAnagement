package com.example.EmployeeRegistration.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeRegistration.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Integer,Address>{

    List<Address> findByZipCode(String zipCode);

    
    
} 
