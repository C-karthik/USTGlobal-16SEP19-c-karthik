import { Component, OnInit, OnDestroy } from '@angular/core';
import { UrlsService } from '../urls.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private auth: UrlsService, private router: Router) { }


  register(form: NgForm) {
    this.error = null;
    this.auth.registerUser(form.value)
      .subscribe(res => {
        console.log('Response of register', res);
        if (res && res.message === 'Success') {
          localStorage.setItem('users', JSON.stringify(res));
          this.router.navigateByUrl('/login');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.message;
      });
  }
  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }

}
