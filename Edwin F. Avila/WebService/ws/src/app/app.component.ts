import { Component } from '@angular/core';
import { NewsService } from '../app/news.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Noticiario';

  noticias: any; 
  constructor( private newsService: NewsService ){
  	newsService.obtenerNoticias().subscribe(
  		val => {
  			this.noticias = val.page.items;
  			console.log( this.noticias );  			
  		}
  	);
  }
}
