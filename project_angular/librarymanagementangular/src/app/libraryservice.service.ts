import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
const headeroption = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
@Injectable({
  providedIn: 'root'
})
export class LibraryserviceService {

  constructor(private http: HttpClient) { }

  registeruser(user): Observable<any> {
     return  this.http.post('http://localhost:8080/librarymanagement/register', user);
}
  loginUser(user): Observable<any> {
      return  this.http.post('http://localhost:8080/librarymanagement/login', user);
}
  addBook(book): Observable<any> {
    return  this.http.post('http://localhost:8080/librarymanagement/addBook', book);
}
viewBooks() {
  return this.http.get<any>('http://localhost:8080/librarymanagement/getAllBook');
}
deleteBook(id) {
  console.log( 'deleting id ', id);
  return this.http.delete(`http://localhost:8080/librarymanagement/deleteBook/${id}`, headeroption);
}
bookrequests() {
  return this.http.get(`http://localhost:8080/librarymanagement/viewreqs`, headeroption);
}
acceptReq(data) {
  return this.http.post(`http://localhost:8080/librarymanagement/acceptreq`, data, headeroption);
}

declineBook(id, data) {
  return this.http.post(`http://localhost:8080/librarymanagement/bookaction/${id}`, data, headeroption);
}

requestBook(userId, data) {
  return this.http.post(`http://localhost:8080/librarymanagement/allocatebook/${userId}`, data, headeroption);
}

 userBooks(){
   return this.http.get(`http://localhost:8080/librarymanagement/user`,headeroption);
 }

}
