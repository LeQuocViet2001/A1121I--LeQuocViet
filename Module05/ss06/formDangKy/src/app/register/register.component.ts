import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, Validators} from '@angular/forms';
import {comparePassword} from './register.validator';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  registerForm: FormGroup;

  constructor() {
  }



  ngOnInit(): void {

    this.registerForm = new FormGroup({
      inputEmail1 : new FormControl('', [Validators.required, Validators.email]),

      password: new FormGroup({
        pass: new FormControl(),
        confirmPass: new FormControl()
      }, comparePassword),
      phone: new FormControl('', [Validators.pattern('^\\+84\\d{9,10}$')])

    });
  }


  //   checkEmail(control: FormControl): ValidationErrors|null {
  //   const check = control.value;
  //   return (check.includes('an')) ? null : {emailError: true};
  //
  // }








}
