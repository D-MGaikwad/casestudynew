import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { StaffManagementService } from '../staff-management.service';

@Component({
  selector: 'app-update-staff',
  templateUrl: './update-staff.component.html',
  styleUrls: ['./update-staff.component.css']
})
export class UpdateStaffComponent implements OnInit {

  employeeCode!: number;
  //employee!: Employee;
  employee: Employee = new Employee(0," "," ",0,0,0," "," ");
  
  constructor(private service: StaffManagementService, private router:Router, private routes: ActivatedRoute) { }

  ngOnInit(): void {
    //this.employee = new Employee(0," "," ",0,0,0," "," ");

    this.employeeCode = this.routes.snapshot.params['employeeCode'];

    this.service.getUserByCode(this.employeeCode).subscribe( data =>{
      console.log(data)
      this.employee = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.service.updateUser(this.employeeCode, this.employee).subscribe( data =>{
    this.goToStaffList();
    },
   error => console.log(error));
  }

  goToStaffList(){
    this.router.navigate(['/findAllStaff']);
  }
}
