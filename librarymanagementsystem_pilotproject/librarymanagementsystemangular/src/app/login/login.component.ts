import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';
import { AuthGuard } from '../auth.guard';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error: any;
  constructor(private auth: UrlsService, private router: Router  , private authga: AuthGuard) { }

  login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {

      if (data && data.role === 'Admin') {
        alert('login success');
        this.router.navigateByUrl(`/`);
        this.authga.isALoggedIn = true;
      } else if (data && data.role === 'Librarian') {

        alert('login success');
        this.router.navigateByUrl(`/`);
        this.authga.isLLoggedIn = true;
      } else if (data && data.role === 'student') {

        alert('login success');
        this.router.navigateByUrl(`/`);
        this.authga.isSLoggedIn = true;
      } else {

        alert('login failed');
      }

    }, err => {

      console.log(err);
      if (err) {
        alert('login credentials are invalid');
      }
    });
  }

  ngOnInit() {
  }

}
