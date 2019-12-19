import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';

@Component({
  selector: 'app-student-deatails',
  templateUrl: './student-deatails.component.html',
  styleUrls: ['./student-deatails.component.css']
})
export class StudentDeatailsComponent implements OnInit {
books: [];
  constructor(private service: LibraryserviceService) {
    this.service.userBooks().subscribe(data => {
      console.log(data);
      localStorage.setItem('bookDetails', JSON.stringify(data));

      const bookDetails = JSON.parse(localStorage.getItem('bookDetails'));
      console.log('my details', bookDetails);
      this.books = bookDetails.bookTrans;
      for (const i in this.books) {
        console.log(this.books[i]);
      }
    });
   }

  ngOnInit() {
  }

}
