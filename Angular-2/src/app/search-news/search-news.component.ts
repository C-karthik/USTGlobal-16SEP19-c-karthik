import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search-news',
  templateUrl: './search-news.component.html',
  styleUrls: ['./search-news.component.css']
})
export class SearchNewsComponent implements OnInit {

  constructor(private http: HttpClient) {
    // this.getSearch();
   }
search;
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  getValue(event) {
    this.search = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=f1f5bbfa84d747e5b533588394db19ff&q=' + this.search).subscribe(data => {
      this.search = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got succesfully');
    });


  }

}
