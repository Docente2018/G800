import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NewsService {

	COL_Noticias = "https://newsapi.org/v2/top-headlines?country=co&language=es&apiKey=890ed3b022e44dedaae9d79d12a03426";
	ESP_Noticias = "http://www.rtve.es/api/noticias.json";

  constructor( private http: HttpClient ) { }

  obtenerNoticias(){
  	return this.http.get( this.ESP_Noticias );
  }

}
