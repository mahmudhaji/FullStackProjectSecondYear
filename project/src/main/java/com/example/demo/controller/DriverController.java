package com.example.demo.controller;

import com.example.demo.mode.Driver;
import com.example.demo.services.DriverServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{LicenceNumber}")
    public Optional<Driver> getDriverById(@PathVariable Integer LicenceNumber){
        return driverServices.getDriverById(LicenceNumber);
    } @DeleteMapping("/{LicenceNumber}")
    public void deleteDriver(@PathVariable Integer LicenceNumber){
        driverServices.deleteDriver(LicenceNumber);
    }

//    @PutMapping("/{licenceNumber}")
//    public void updateDriver(@PathVariable Integer licenceNumber, @RequestBody Driver updatedDriver) {
//        driverServices.updateDriver(licenceNumber, updatedDriver);
//    }

}
