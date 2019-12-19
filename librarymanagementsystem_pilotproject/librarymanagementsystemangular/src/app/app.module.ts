import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddbookComponent } from './addbook/addbook.component';
import { IssuedbookComponent } from './issuedbook/issuedbook.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { DisplaybooksComponent } from './displaybooks/displaybooks.component';
import { ViewrequestComponent } from './viewrequest/viewrequest.component';
import { AddusersComponent } from './addusers/addusers.component';
import { RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { AuthGuard } from './auth.guard';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { PipePipe } from './pipe.pipe';
import { DisplayusersComponent } from './displayusers/displayusers.component';
import { UserpipePipe } from './userpipe.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddbookComponent,
    IssuedbookComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    DisplaybooksComponent,
    ViewrequestComponent,
    AddusersComponent,
    AdminComponent,
    UserComponent,
    RequestbookComponent,
    PipePipe,
    DisplayusersComponent,
    UserpipePipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule ,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'Admin', component : AdminComponent, canActivate: [AuthGuard], data: { role: ['Admin']}},
      {path: 'user', component: UserComponent, canActivate: [AuthGuard], data: { role: ['Admin', 'Librarian'] }},
      {path: 'login', component: LoginComponent},
      {path: 'register', component: RegisterComponent},
      {path: 'adduser', component : AddusersComponent},
      {path: 'addbook', component: AddbookComponent},
      {path: 'issuedbook', component : IssuedbookComponent},
      {path: 'viewrequest', component : ViewrequestComponent},
      {path: 'displaybooks' , component : DisplaybooksComponent},
      {path: 'requestbook', component: RequestbookComponent},
      {path: 'showallusers', component: DisplayusersComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
