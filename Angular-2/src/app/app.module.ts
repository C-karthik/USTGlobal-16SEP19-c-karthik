import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AbhilashComponent } from './abhilash/abhilash.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchNewsComponent } from './search-news/search-news.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AbhilashComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchNewsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
        {path: '', component: AbhilashComponent},
        {path: 'about', component: CountriesComponent},
        {path: 'help', component: CategoriesComponent},
        {path: 'source', component: SourcesComponent},
        {path: 'News', component: SearchNewsComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
