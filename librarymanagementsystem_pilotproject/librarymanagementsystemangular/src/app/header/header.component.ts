import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthGuard} from '../auth.guard';
import { UrlsService } from '../urls.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent  {

  constructor(private router: Router , private service: UrlsService ,  private auth: AuthGuard ) { }

get isALoggedIn() {

  return this.auth.isAdmin();

}
get isLLoggedIn() {

  return this.auth.isLibrarian();
}
get isSLoggedIn() {

  return this.auth.isStudent();
}
  logout() {
   this.auth.isALoggedIn = false;
   this.auth.isLLoggedIn = false;
   this.auth.isLLoggedIn = false;
   alert('successfully logout seen you soon')
   this.router.navigateByUrl('/login');
   
  }

}

