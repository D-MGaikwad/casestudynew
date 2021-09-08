import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { StaffManagementService } from '../staff-management.service';

@Component({
  selector: 'app-staff-services',
  templateUrl: './staff-services.component.html',
  styleUrls: ['./staff-services.component.css']
})
export class StaffServicesComponent implements OnInit {

  employees:any;
  employeeCode!: number;
  message: any;
  constructor(private service: StaffManagementService, private router:Router) { }

public deleteUser(employeeCode:number){

  console.log(employeeCode);
  const index = this.employees.indexOf(employeeCode);
  this.employees.splice(index,1);

  let resp= this.service.deleteUser(employeeCode);
  resp.subscribe((data)=>this.employees=data);
}

public findUserByCode(employeeCode:number){
/*
  console.log(employeeCode);
  const index = this.employees.indexOf(employeeCode);
  this.employees.search(index,1);
*/
  let resp= this.service.getUserByCode(employeeCode);
  resp.subscribe((data)=>this.employees=data);
 }

 /*
public updateUser(){
   this.router.navigate(['updateStaff']);
   let resp=this.service.updateUser(this.employees);
 resp.subscribe((data)=>this.message=data);
} */


  ngOnInit(): void {
    let resp=this.service.getUser();
    resp.subscribe((data)=>this.employees=data);
  }

 updateUser(employeeCode:number){
   this.router.navigate(['updateStaff',employeeCode]);
 }

}
