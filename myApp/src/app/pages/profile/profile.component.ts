import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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
                        // service name
    constructor(private ds:DriverService,private route:Router){

    }

    fetchAllDriver(){
      this.ds.get().subscribe((response)=>{
          console.log(response)
          this.driverList=response
      })
    }
    //fuction for delete
    delete(list:any){
      this.ds.deleteById(list).subscribe(response=>{
        this.fetchAllDriver()
      })
    }
    edit(list:any){
      this.route.navigateByUrl("update/"+list.licenceNumber)
    }
}
