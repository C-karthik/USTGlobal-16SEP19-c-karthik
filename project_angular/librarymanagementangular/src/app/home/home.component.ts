import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) { }

  isLoggedIn(): boolean {
const userDeatails = JSON.parse(localStorage.getItem('userDetails'));
if (userDeatails) {
  return true;
} else {
  return false;
}

}
isAdmin() {
  const userDetails = JSON.parse(localStorage.getItem('userDetails'));
  if (userDetails && userDetails.users[0].userRole === 'admin') {
    return true;
  } else {
    return false;
  }
}

isLibrarian() {
  const userDetails = JSON.parse(localStorage.getItem('userDetails'));
  if (userDetails && userDetails.users[0].userRole === 'librarian') {
    return true;
  } else {
    return false;
  }
}

isStudent() {
  const userDetails = JSON.parse(localStorage.getItem('userDetails'));
  if (userDetails && userDetails.users[0].userRole === 'student') {
    return true;
  } else {
    return false;
  }
}

logout() {
  localStorage.removeItem('userDetails');
  this.router.navigateByUrl('/log');

}

  ngOnInit() {
  }

}
