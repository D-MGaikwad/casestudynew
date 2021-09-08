import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GuestManagementServiceService } from '../guest-management-service.service';
import { User } from '../user';

@Component({
  selector: 'app-guest-service',
  templateUrl: './guest-service.component.html',
  styleUrls: ['./guest-service.component.css']
})
export class GuestServiceComponent implements OnInit {

  users:any;
  guestId!: number;
  message:any;
  //user: User=new User(0,0,"","","","","","");
  
  
  constructor(private service:GuestManagementServiceService, private router:Router) { }

  public deleteUser(guestId:number){

    console.log(guestId);
    const index = this.users.indexOf(guestId);
    this.users.splice(index,1);

    let resp= this.service.deleteUser(guestId);
    resp.subscribe((data)=>this.users=data);
   }
   
   public findUserByGuestId(guestId:number){
     let resp= this.service.getUserByGuestId(guestId);
     resp.subscribe((data)=>this.users=data);
    }

    ngOnInit(): void {
      let resp=this.service.getUsers();
      resp.subscribe((data)=>this.users=data);
    }
    
    updateUser(guestId:number){
      this.router.navigate(['updateGuest',guestId]);
    }
  
/*
  updateGuest(){
      this.router.navigate(['updateGuest']);
      let resp=this.service.updateUser(this.user);
    resp.subscribe((data)=>this.message=data);
  } 
  */

 
}
