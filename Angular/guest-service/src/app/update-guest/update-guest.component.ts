import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { GuestManagementServiceService } from '../guest-management-service.service';
import { User } from '../user';

@Component({
  selector: 'app-update-guest',
  templateUrl: './update-guest.component.html',
  styleUrls: ['./update-guest.component.css']
})
export class UpdateGuestComponent implements OnInit {

  guestId!: number;
  //user:any;
  user: User = new User(0,0,"","","","","","");

  constructor(private service: GuestManagementServiceService,private router:Router, private routes: ActivatedRoute) { }

  ngOnInit(): void {
   this.user = new User(0,0,"","","","","","");

    this.guestId = this.routes.snapshot.params['guestId'];

    this.service.getUserByGuestId(this.guestId).subscribe(data =>{
      console.log(data)
      this.user = data;
    },error => console.log(error));
  }

  onSubmit(){
    this.service.updateUser(this.guestId, this.user).subscribe(data =>{
    this.goToStaffList();
    },
    error => console.log(error));
  }

  goToStaffList(){
    this.router.navigate(['/findAllGuest']);
  }
}
