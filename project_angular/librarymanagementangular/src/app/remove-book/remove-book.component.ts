import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';
import { Router } from '@angular/router';
import {  ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-remove-book',
  templateUrl: './remove-book.component.html',
  styleUrls: ['./remove-book.component.css']
})
export class RemoveBookComponent implements OnInit {
msg;
books: [];
  constructor(private library: LibraryserviceService) {
    this.showBooks();
  }
  showBooks(){
    this.library.viewBooks().subscribe(data => {
      console.log(data);
      this.books = data.books;

    });

  }
   deleteBook(book) {

    this.library.deleteBook(book.bookId).subscribe(data => {
    
      console.log(data);
      this.msg='Book Deleted Successfully';
      this.showBooks();

  });
  
  }


  ngOnInit() {
  }

}
