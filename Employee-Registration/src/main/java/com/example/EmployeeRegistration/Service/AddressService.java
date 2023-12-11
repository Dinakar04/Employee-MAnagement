package com.example.EmployeeRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.EmployeeRegistration.Entity.Address;
import com.example.EmployeeRegistration.Repositary.AddressRepo;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepo addressRepo;

    public List<Address> getAllAddressZip(String zipCode){
        return addressRepo.findByZipCode(zipCode);
    }
}
