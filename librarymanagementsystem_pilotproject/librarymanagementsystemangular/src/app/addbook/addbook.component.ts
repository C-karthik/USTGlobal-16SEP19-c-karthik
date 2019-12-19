import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  error: any;
  constructor(private auth: UrlsService, private router: Router) { }

  addbook(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.addBook(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'Success') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl(`/displaybooks`);
      }
      form.reset();
    }, err => {

      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}

