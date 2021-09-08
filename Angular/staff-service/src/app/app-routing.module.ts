import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StaffEntryComponent } from './staff-entry/staff-entry.component';
import { StaffServicesComponent } from './staff-services/staff-services.component';
import { UpdateStaffComponent } from './update-staff/update-staff.component';

const routes: Routes = [
  {path:"",redirectTo:"addStaff" ,pathMatch:"full"},
  {path:"addStaff",component:StaffEntryComponent},
  {path:"findAllStaff",component:StaffServicesComponent},
  {path:"updateStaff/:employeeCode",component:UpdateStaffComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
