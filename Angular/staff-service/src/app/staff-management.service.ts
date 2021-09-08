import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class StaffManagementService {

  private baseURL ="http://localhost:9002/updateStaff/";
  private base_URL ="http://localhost:9002/findAllStaff/";
  //employee: Employee = new Employee(0," "," ",0,0,0," "," ");

  constructor(private http:HttpClient) { }

public doRegistration(employee: any){
  return this.http.post("http://localhost:9002/addStaff",employee,{responseType:'text' as 'json'});
}

public getUser(){
  return this.http.get("http://localhost:9002/findAllStaff");
}
/*
public getUserByCode(employeeCode:number){
  return this.http.get("http://localhost:9002/findAllStaff/"+employeeCode,{responseType:'text' as 'json'});
}
*/

getUserByCode(employeeCode:number): Observable<Employee>{
  return this.http.get<Employee>(`${this.base_URL}/${employeeCode}`);
}

public deleteUser(employeeCode:any){
  return this.http.delete("http://localhost:9002/delete/"+employeeCode);
}

getStaffByEmployeeCode(employeeCode:number): Observable<Employee>{
  return this.http.get<Employee>(`${this.baseURL}/${employeeCode}`);
}

updateUser(employeeCode:number,employee:Employee): Observable<Object>{
  return this.http.put(`${this.baseURL}/${employeeCode}`,employee);
}



/*
public updateUser(employee: any){
  return this.http.put("http://localhost:9002/updateStaff",employee,{responseType:'text' as 'json'});
}*/

}
