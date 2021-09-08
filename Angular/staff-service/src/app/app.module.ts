import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StaffEntryComponent } from './staff-entry/staff-entry.component';
import { StaffManagementService } from './staff-management.service';
import { StaffServicesComponent } from './staff-services/staff-services.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UpdateStaffComponent } from './update-staff/update-staff.component';

@NgModule({
  declarations: [
    AppComponent,
    StaffEntryComponent,
    StaffServicesComponent,
    UpdateStaffComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [StaffManagementService],
  bootstrap: [AppComponent]
})
export class AppModule { }
