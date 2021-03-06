import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
@Injectable({
    providedIn : 'root'
})
export class AuthGuard implements CanActivate {
    canActivate(route: ActivatedRouteSnapshot): boolean {

  const expectedRoleArray = route.data.roles;
  const userDeatails = JSON.parse(localStorage.getItem('userDetails'));

  let  expectedRole: string;
  for (const index in expectedRoleArray) {
     if (userDeatails && userDeatails.userRole === expectedRoleArray[index] ) {
        expectedRole = expectedRoleArray[index];
     }

   }
  if (userDeatails && expectedRole === userDeatails.userRole) {
    console.log('user authenticated');
    return true;
} else {
    console.log('user unauthenticated');
    return false;
}

    }

}
