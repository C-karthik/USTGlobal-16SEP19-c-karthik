import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
msg;
  constructor(private libraryService: LibraryserviceService, private router: Router ) { }

  addBook(bookform) {
    this.libraryService.addBook(bookform.value).subscribe(res => {
       console.log('book added successfully');
       this.msg='Book Added Successfully...!';
      //  this.router.navigateByUrl('/lib');
       // this.msg='Book Added Successfully';
       bookform.reset();
    }, err => {
       console.log('book not added');
    });
 }




  ngOnInit() {
  }

}
