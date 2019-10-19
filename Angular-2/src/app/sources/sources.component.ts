import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {

  sorGet: any;
  newStorage: any;

  constructor(private http: HttpClient) {
    this.getsorGet();
  }
  showSour(event) {
    this.newStorage = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=06fbbb7ab0194ed3a43c4e085c3e4fcd&sources=' + this.newStorage
    ).subscribe(data => {
    this.sorGet = data.articles;
    console.log(data);
  }, err => {
    console.log(err);
  }, () => {
    console.log('date get successfully');
  });

}
    getsorGet() {
      // tslint:disable-next-line: max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=06fbbb7ab0194ed3a43c4e085c3e4fcd').subscribe(data => {
      this.sorGet = data.articles;
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

