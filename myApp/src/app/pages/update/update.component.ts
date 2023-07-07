import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { DriverService } from 'src/app/services/driver.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  ngOnInit(): void {
   this.formControl();
    this.activeroute.params.subscribe((values:any)=>{

      console.log("values",values)

      const licenceNumber= values.licenceNumber;

      this.formsfild(licenceNumber)
    })
  }
  formsfild(licenceNumber: any) {
   this.ds.getById(licenceNumber).subscribe((response:any)=>{
    this.updateform.get("fname")?.setValue(response.fname)
    this.updateform.get("mname")?.setValue(response.mname)
    this.updateform.get("lname")?.setValue(response.lname)
    this.updateform.get("licenceNumber")?.setValue(response.licenceNumber)
    this.updateform.get("casesname")?.setValue(response.casesname)
    this.updateform.get("carplatenumber")?.setValue(response.carplatenumber)
    this.updateform.get("courtname")?.setValue(response.courtname)
   })
  }
  constructor(private activeroute:ActivatedRoute,private ds:DriverService,private route:Router){

  }
  updateform!:FormGroup
  onsave(){
    const values =this.updateform.value
    this.ds.add(values).subscribe((response:any)=>{
      alert("update successfull")
      this.route.navigateByUrl("profile")
    })
  }
  formControl (){
    this.updateform=new FormGroup({
      fname:new FormControl(null,[Validators.required]),
      mname:new FormControl(null,[Validators.required]),
      lname:new FormControl(null,[Validators.required]),
      // Age:new FormControl(null,[Validators.required]),
      licenceNumber:new FormControl(null,[Validators.required]),
      courtname:new FormControl(null,[Validators.required]),
      carplatenumber:new FormControl(null,[Validators.required]),
      casesname:new FormControl(null,[Validators.required])

    })
  }
}
