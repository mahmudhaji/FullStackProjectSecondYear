package com.example.demo.controller;

import com.example.demo.mode.Driver;
import com.example.demo.services.DriverServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/driver")
public class DriverController {
    @Autowired
    public DriverServices driverServices;

    @PostMapping
    public Driver addDriver(@RequestBody Driver driver){
        return driverServices.addDriver(driver);
    }
    @GetMapping
    public List<Driver> getAll(){
        return driverServices.getAll();
    }
}
