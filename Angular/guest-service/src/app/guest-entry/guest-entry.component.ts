import { Component, OnInit } from '@angular/core';
import { GuestManagementServiceService } from '../guest-management-service.service';
import { User } from '../user';

@Component({
  selector: 'app-guest-entry',
  templateUrl: './guest-entry.component.html',
  styleUrls: ['./guest-entry.component.css']
})
export class GuestEntryComponent implements OnInit {

  user: User=new User(0,0,"","","","","","");
  message:any;

  constructor(private service:GuestManagementServiceService) { }

  ngOnInit(): void {
  }

  public registerNow(){
    let resp=this.service.doRegistration(this.user);
    resp.subscribe((data)=>this.message=data);
      }

}
