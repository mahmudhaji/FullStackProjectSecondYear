package com.example.demo.services;

import com.example.demo.mode.Court;
import com.example.demo.mode.Driver;
import com.example.demo.repository.CourtRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtService {
    @Autowired
    public CourtRepo courtRepo;
    public Court addDriver(Court court){
        return courtRepo.save(court);
    }
}
