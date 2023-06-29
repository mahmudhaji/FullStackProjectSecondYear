import { Component, OnInit } from '@angular/core';
import { DriverService } from 'src/app/services/driver.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit{
  driverList:any
  ngOnInit(): void {
    this.fetchAllDriver()
  }

    constructor(private ds:DriverService){

    }

    fetchAllDriver(){
      this.ds.get().subscribe((response)=>{
          console.log(response)
          this.driverList=response
      })
    }

}
