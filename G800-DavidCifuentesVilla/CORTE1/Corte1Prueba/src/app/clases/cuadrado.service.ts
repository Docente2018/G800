import { Injectable } from '@angular/core';
import { Figura } from "./figura";

@Injectable({
  providedIn: 'root'
})
export class CuadradoService extends Figura{

  public ladoCuad: number;
  
  public establecerLadoCuad(lado: number){
    this.ladoCuad = lado;
  }
  calcularArea(): number{
    return this.ladoCuad ** 2
  }
  calcularPerimetro(): number{
    return 4 * this.ladoCuad;
  }
}
