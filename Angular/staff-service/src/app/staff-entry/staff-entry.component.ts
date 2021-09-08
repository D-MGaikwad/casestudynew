import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { StaffManagementService } from '../staff-management.service';

@Component({
  selector: 'app-staff-entry',
  templateUrl: './staff-entry.component.html',
  styleUrls: ['./staff-entry.component.css']
})
export class StaffEntryComponent implements OnInit {

  employee: Employee= new Employee(0," "," ",0,0,0," "," ");
  message!: any;

  constructor(private service:StaffManagementService) { }

  ngOnInit(): void {
  }

public registerNow(){

  let resp=this.service.doRegistration(this.employee);
  resp.subscribe((data)=>this.message=data);

}

}
