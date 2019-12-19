import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryserviceService } from '../libraryservice.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  isdisabled;
  books: any[] = [];
msg;
  allocatedBooks: any = {};

  constructor(private service: LibraryserviceService, private router: Router) {
    this.display();
  }

   display(){
    this.service.viewBooks().subscribe(data => {
      console.log(data);
      this.books = data.books;

    });
   }


  sendRequest(book,i) {
   
      
    console.log(book);
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    
    const userId = userDetails.users[0].userId;
   
    this.service.requestBook(userId, book).subscribe(data => {
      this.msg='Request Sent to Librarian';
       console.log(data);
       this.display();
      
     });
   
  }

  ngOnInit() {
  }

}
