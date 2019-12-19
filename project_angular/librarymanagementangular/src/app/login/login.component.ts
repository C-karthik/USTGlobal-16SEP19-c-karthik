import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { LibraryserviceService } from '../libraryservice.service';
import { AuthenticationserviceService } from '../authenticationservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error;
msg;
  constructor( private library: LibraryserviceService, private router: Router) {}
   ngOnInit() {
  }
  userlogin( form: NgForm) {
    console.log(form.value);
    this.error = null;
    this.library.loginUser(form.value)
   .subscribe(res => {
        console.log( 'Response from backend', res);
        if (res && res.message === 'Success') {
     localStorage.setItem('userDetails', JSON.stringify(res));
     const userDetails = JSON.parse(localStorage.getItem('userDetails'));
     console.log(userDetails);
     if (userDetails && userDetails.users[0].userRole === 'admin') {
      this.router.navigateByUrl('/reg');
     } else if (userDetails && userDetails.users[0].userRole === 'student') {
      this.router.navigateByUrl('/student');
     } else {
      this.router.navigateByUrl('/lib');
     }
     form.reset();
    } else {
        this.msg = 'Invalid userName or Password';
        form.reset();
    }
   }, err => {
     console.log(err);
     this.error = err.error.message;
   });
  }

}
