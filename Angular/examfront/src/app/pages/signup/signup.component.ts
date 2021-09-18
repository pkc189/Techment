import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService:UserService) { }

public user = {
  username:'',
  password:'',
  firstName:'',
  lastName:'',
  email:'',
  phone:'',
}



  ngOnInit(): void {
  }


  formSubmit(){

   this.userService.addUser(this.user).subscribe(
     (data)=>{
       alert('success')
     },
     (error)=>{
       console.log(error)
     }
   )
  }


}
