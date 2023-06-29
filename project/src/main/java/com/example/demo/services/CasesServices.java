package com.example.demo.services;

import com.example.demo.mode.Cases;
import com.example.demo.repository.CasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasesServices {
    @Autowired
    public CasesRepository casesRepository;

    public Cases addCases( Cases cases){
        return casesRepository.save(cases);
    }

}
