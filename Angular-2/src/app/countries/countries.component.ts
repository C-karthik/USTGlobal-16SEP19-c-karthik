import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {

  ctynews: any;
  newStorage: any;

  constructor(private http: HttpClient) {
    this.getCtyNews();
  }
  changeNews(event) {
    this.newStorage = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=f1f5bbfa84d747e5b533588394db19ff&country=' + this.newStorage
    ).subscribe(data => {
    this.ctynews = data.articles;
    console.log(data);
  }, err => {
    console.log(err);
  }, () => {
    console.log('date get successfully');
  });

}
    getCtyNews() {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=06fbbb7ab0194ed3a43c4e085c3e4fcd').subscribe(data => {
      this.ctynews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('date get successfully');
    });

  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}


