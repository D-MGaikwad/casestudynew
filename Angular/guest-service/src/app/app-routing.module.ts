import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuestEntryComponent } from './guest-entry/guest-entry.component';
import { GuestServiceComponent } from './guest-service/guest-service.component';
import { UpdateGuestComponent } from './update-guest/update-guest.component';

const routes: Routes = [
  {path:"",redirectTo:"addGuest",pathMatch:"full"},
  {path:"addGuest",component:GuestEntryComponent},
  {path:"findAllGuest",component:GuestServiceComponent},
  {path:"updateGuest/:guestId",component:UpdateGuestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
