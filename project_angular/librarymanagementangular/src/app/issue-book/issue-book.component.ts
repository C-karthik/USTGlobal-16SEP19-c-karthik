import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryserviceService } from '../libraryservice.service';

@Component({
  selector: 'app-issue-book',
  templateUrl: './issue-book.component.html',
  styleUrls: ['./issue-book.component.css']
})
export class IssueBookComponent implements OnInit {
msg;
  requests: any = {};
  bookRequests: any[] = [];

  constructor(private service: LibraryserviceService, private router: Router) {
    this.requestBook(); 
  }
  requestBook(){
    
    this.service.bookrequests().subscribe(data => {
      console.log(data);
      this.requests = data;
      console.log(this.requests);
      console.log(this.requests.bookReg);
      this.bookRequests = this.requests.bookReg;
     });
  }

  acceptReq(reqs) {
  
    this.service.acceptReq(reqs).subscribe(data => {
      console.log(data);

      this.msg='you accepted the request';
      this.requestBook();
    });

  

  }

  decline(reqs) {
    console.log(reqs.bookId);

    this.service.declineBook(reqs.bookId, reqs).subscribe(dat => {
      console.log(dat);
      this.msg='Request Declined...!';
      this.requestBook(); 
    });

  }
 

  ngOnInit() {
  }

}
