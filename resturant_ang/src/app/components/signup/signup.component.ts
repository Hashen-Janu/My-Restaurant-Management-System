import { Component } from '@angular/core';
import {AuthService} from "../../services/auth/auth.service";
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent {

  constructor(private service: AuthService,
              private fb: FormBuilder) {}

  register(){
    this.service.signup().subscribe((res) =>{
      console.log(res);
    })
  }
}
