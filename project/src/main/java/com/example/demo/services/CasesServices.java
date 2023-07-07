package com.example.demo.services;

import com.example.demo.mode.Cases;
import com.example.demo.mode.Driver;
import com.example.demo.repository.CasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasesServices {
    @Autowired
    public CasesRepository casesRepository;

    public Cases addCases( Cases cases){
        return casesRepository.save(cases);
    }
    public List<Cases> getAll(){
        return casesRepository.findAll();
    }
    public Optional<Cases> getCasesById(Integer Id){
        return casesRepository.findById(Id);
    }
    public void deleteCases(Integer Id){
        casesRepository.deleteById(Id);
    }

}
