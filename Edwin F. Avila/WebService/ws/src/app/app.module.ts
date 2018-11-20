import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

//Importando Servicios
import { HttpModule } from "@angular/http";
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NewsService } from '../app/news.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [   	
    HttpClientModule,
  	NewsService 
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
