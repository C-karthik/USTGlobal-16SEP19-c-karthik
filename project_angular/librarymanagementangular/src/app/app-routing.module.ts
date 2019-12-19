import { StudentDeatailsComponent } from './student-deatails/student-deatails.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { RemoveBookComponent } from './remove-book/remove-book.component';
import { IssueBookComponent } from './issue-book/issue-book.component';
import { AddBookComponent } from './add-book/add-book.component';
import { HeaderComponent } from './header/header.component';


const routes: Routes = [

  // {path :'', component :HomeComponent},
   {path : 'admin', component : AdminComponent, canActivate : [AuthGuard], data : {roles : ['admin']} },
   {path : 'student', component : StudentComponent,  canActivate : [AuthGuard], data : {roles : ['student']} },
  {path : 'lib', component : LibrarianComponent,  canActivate : [AuthGuard], data : {roles : ['librarian']} },
  {path : 'addbook', component : AddBookComponent },
  {path : 'removebook', component : RemoveBookComponent },
  {path : 'issuebook', component : IssueBookComponent},
  {path : 'reg', component : RegisterComponent},
  {path : 'log', component : LoginComponent},
  {path : 'sbd', component :StudentDeatailsComponent},
  {path : 'head', component :HeaderComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
