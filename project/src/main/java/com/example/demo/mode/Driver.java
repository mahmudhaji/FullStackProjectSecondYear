package com.example.demo.mode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor @AllArgsConstructor @Entity
public class Driver {
    @Id
    public Integer LicenceNumber;
    public  String FName;
    public  String MName;
    public  String LName;
//    public  Integer Age;
    public String CasesName;
//    public String gender;
//    public Date DateOfAccident;
    public String CarPlateNumber;
    public String CourtName;
//    public Date DateJudgment;
}
