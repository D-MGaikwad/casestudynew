import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GuestManagementServiceService } from './guest-management-service.service';
import { GuestServiceComponent } from './guest-service/guest-service.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GuestEntryComponent } from './guest-entry/guest-entry.component';
import { UpdateGuestComponent } from './update-guest/update-guest.component';

@NgModule({
  declarations: [
    AppComponent,
    GuestServiceComponent,
    GuestEntryComponent,
    UpdateGuestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [GuestManagementServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
