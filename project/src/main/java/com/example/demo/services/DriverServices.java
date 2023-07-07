package com.example.demo.services;

import com.example.demo.mode.Driver;
import com.example.demo.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
    public Optional<Driver> getDriverById(Integer LicenceNumber){
        return  driverRepository.findById(LicenceNumber);
    }
    public void deleteDriver(Integer LicenceNumber){
        driverRepository.deleteById(LicenceNumber);
    }
//    public void updateDriver(Integer licenceNumber, Driver updatedDriver) {
//        Optional<Driver> optionalDriver = driverRepository.findById(licenceNumber);
//        if (optionalDriver.isPresent()) {
//            Driver driver = optionalDriver.get();
//            // Update the driver properties with the values from updatedDriver
//            driver.setLicenceNumber(updatedDriver.getLicenceNumber());
//
//
//            // Save the updated driver
//            driverRepository.save(driver);
//        } else {
//            // Handle the case when the driver with the given licence number is not found
//            throw new IllegalArgumentException("Driver not found with licence number: " + licenceNumber);
//        }
//    }

}
