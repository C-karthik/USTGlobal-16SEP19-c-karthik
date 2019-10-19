import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-abhilash',
  templateUrl: './abhilash.component.html',
  styleUrls: ['./abhilash.component.css']
})
export class AbhilashComponent implements  OnInit {
  entNews;
  topNews;
  sptNews;
  constructor(private http: HttpClient) {
    this.getEntNews();
    this.getTopNews();
    this.getSptNews();
  }
  getEntNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=f1f5bbfa84d747e5b533588394db19ff'
    ).subscribe(data => {
    this.entNews = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('entertainment news got succesfully');
    });
  }
  getTopNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=f1f5bbfa84d747e5b533588394db19ff').subscribe(data => {
      this.topNews = data.articles;
      console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log('top news got succesfully');
      });
  }
  getSptNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=sports&apiKey=f1f5bbfa84d747e5b533588394db19ff').subscribe(data => {
      this.sptNews = data.articles;
      console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log('sports news got succesfully');
      });
  }
  ngOnInit() {
  }

}


