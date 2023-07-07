package com.example.demo.mode;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Driver {
    @Id
    @JsonProperty("licenceNumber")
    public Integer LicenceNumber;

    @JsonProperty("fname")
    public String FName;

    @JsonProperty("mname")
    public String MName;

    @JsonProperty("lname")
    public String LName;

    //    public  Integer Age;
    @JsonProperty("casesname")
    public String CasesName;
    //    public String gender;
//    public Date DateOfAccident;
    @JsonProperty("carplatenumber")
    public String CarPlateNumber;

    @JsonProperty("courtname")
    public String CourtName;

//    public Date DateJudgment;

}
