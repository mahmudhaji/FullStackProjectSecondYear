package com.example.demo.controller;

import com.example.demo.mode.Cases;
import com.example.demo.services.CasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cases")
public class CasesController {
    @Autowired
    public CasesServices casesServices;

    @PostMapping
    public Cases addCases( @RequestBody Cases cases) {
        return casesServices.addCases(cases);
    }
}