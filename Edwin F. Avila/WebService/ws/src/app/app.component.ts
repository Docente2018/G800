import { Component } from '@angular/core';
import { NewsService } from '../app/news.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Noticiario';
//Noticias
  noticias: any; 
  constructor( private newsService: NewsService ){
  	newsService.obtenerNoticias().subscribe(
  		val => {
        //coje toda la data y la guarda en noticias
  			this.noticias = val.page.items;
  			console.log( this.noticias );  			
  		}
  	);
  }
}
