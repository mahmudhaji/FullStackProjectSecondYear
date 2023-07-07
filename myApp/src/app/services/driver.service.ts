import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DriverService {
  // variable for api link
  private api = String ("http://localhost:8080/api/v1/driver")

  constructor(private Http:HttpClient) { }

    add(body:any){
      return this.Http.post(this.api,body)

    }

    get(){
      return this.Http.get(this.api)

    }
    getById(LicenceNumber:any){
      const url=`${this.api}/${LicenceNumber}`
      return this.Http.get(url)
    }
    update(){

    }
    deleteById(LicenceNumber:any){
      const url=`${this.api}/${LicenceNumber}`
      return this.Http.delete(url)
    }
}
