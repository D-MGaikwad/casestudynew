import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class GuestManagementServiceService {

  private baseURL ="http://localhost:9001/updateGuest/";
  private base_URL ="http://localhost:9001/findAllGuest/";

  constructor(private http:HttpClient) { }

  public doRegistration(user: User){
    return this.http.post("http://localhost:9001/addGuest",user,{responseType:'text' as 'json'});
  }

  public getUsers(){
    return this.http.get("http://localhost:9001/findAllGuest");
  }
/*
  public getUserByGuestId(guestId: number){
    console.log(this.http.get("http://localhost:9001/findAllGuest/"+guestId))
    return this.http.get("http://localhost:9001/findAllGuest/"+guestId);
  }
*/
  public deleteUser(guestId: any){
    return this.http.delete("http://localhost:9001/delete/"+guestId);
  
  }

  getUserByGuestId(guestId:number): Observable<User>{
    return this.http.get<User>(`${this.base_URL}/${guestId}`);
  }

getGuestByGuestId(guestId:number): Observable<User>{
  return this.http.get<User>(`${this.baseURL}/${guestId}`);
}

updateUser(guestId:number,user:User): Observable<Object>{
  return this.http.put(`${this.baseURL}/${guestId}`,user);
}

/*
  public updateUser(user: User){
    return this.http.put("http://localhost:8080/update",user,{responseType:'text' as 'json'});
    
  }*/


}
