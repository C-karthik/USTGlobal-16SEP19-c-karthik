import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { LibraryserviceService } from '../libraryservice.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
   err;
msg;
  constructor(private library: LibraryserviceService) { }

  ngOnInit() {
  }
  register(form: NgForm) {
    this.err = null;
    this.library. registeruser(form.value)
   .subscribe(res => {
        console.log(res);
        this.msg='user is added';
        form.reset();
   }, err => {
     console.log(err);
   }, () => {});
  }




}
