import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { DriverService } from 'src/app/services/driver.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  
  ngOnInit(): void {
   this.formControl();
    

  }
  constructor(private driverService:DriverService,private rout:Router){

    
  }
  formControl (){
    this.addform=new FormGroup({
      FName:new FormControl(null,[Validators.required]),
      MName:new FormControl(null,[Validators.required]),
      LName:new FormControl(null,[Validators.required]),
      // Age:new FormControl(null,[Validators.required]),
      LicenceNumber:new FormControl(null,[Validators.required]),
      CourtName:new FormControl(null,[Validators.required]),
      CarPlateNumber:new FormControl(null,[Validators.required]),
      CasesName:new FormControl(null,[Validators.required])

    })
  }

  addform!:FormGroup;
  onsave(){
    const values=this.addform.value;
    this.driverService.add(values).subscribe((response)=>{
      this.rout.navigateByUrl("profile")
      // console.log("my values",response)

    })
  }


}
