package com.example.demo.controller;

import com.example.demo.mode.Cases;
import com.example.demo.services.CasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/cases")
public class CasesController {
    @Autowired
    public CasesServices casesServices;

    @PostMapping
    public Cases addCases( @RequestBody Cases cases) {
        return casesServices.addCases(cases);
    }
    @GetMapping
    public List<Cases> getAll(){
        return casesServices.getAll();
    }
    @GetMapping("/{Id}")
    public Optional<Cases> getCasesById(@RequestBody Integer Id){
        return casesServices.getCasesById(Id);
    }

}
