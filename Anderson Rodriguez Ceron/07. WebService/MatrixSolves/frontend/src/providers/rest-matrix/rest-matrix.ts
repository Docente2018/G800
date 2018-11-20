import { Injectable } from '@angular/core';

//Http imports
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import 'rxjs/add/operator/map';
import { URL_SERVICE } from '../../config/url.servicios';

/*
  Generated class for the RestMatrixProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class RestMatrixProvider {

  constructor(public httpClient: HttpClient) {
    console.log('Hello RestMatrixProvider Provider');
  }

  solveMatrix( matrix: any, vector: any ){

    let url = URL_SERVICE + "/view";
    let jsonPost = { "matrix": JSON.stringify(matrix),
				 "vectorSolution": JSON.stringify(vector) }
	console.log("IN PROMISE", jsonPost);
	
    return new Promise((resolve, reject) => {

      this.httpClient.post(url,jsonPost,{
        headers: new HttpHeaders()          
          .set('Content-Type', 'application/json')
      	})
        .subscribe(res => {
          console.log("Respuesta: "+ JSON.stringify(res));
          resolve( res );
        }, (err) => {
          reject( err );
          console.log("Works invalido!", err);
        });
    });
  }
}
