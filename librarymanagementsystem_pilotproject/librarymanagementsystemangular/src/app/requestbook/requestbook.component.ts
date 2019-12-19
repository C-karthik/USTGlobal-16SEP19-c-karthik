import { Component, OnInit } from '@angular/core';
import { UrlsService } from '../urls.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-requestbook',
  templateUrl: './requestbook.component.html',
  styleUrls: ['./requestbook.component.css']
})
export class RequestbookComponent implements OnInit {

  error: any;
  constructor(private auth: UrlsService, private router: Router) { }

  requestBook(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.request(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'Success') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        alert('request sended successfully');

        this.router.navigateByUrl(`/`);
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
