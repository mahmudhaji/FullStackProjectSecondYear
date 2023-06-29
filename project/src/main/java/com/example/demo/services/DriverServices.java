package com.example.demo.services;

import com.example.demo.mode.Driver;
import com.example.demo.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServices {
    @Autowired
    public DriverRepository driverRepository;

    public  Driver addDriver(Driver driver){
        return driverRepository.save(driver);
    }

    public List<Driver> getAll(){
        return driverRepository.findAll();
    }
}
