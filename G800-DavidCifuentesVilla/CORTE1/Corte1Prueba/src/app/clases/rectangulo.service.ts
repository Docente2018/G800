import { Injectable } from '@angular/core';
import { Figura } from './figura';

@Injectable({
  providedIn: 'root'
})
export class RectanguloService extends Figura {

  private baseRecta: number;
  private alturaRecta: number;
  
  public establecerBaseRecta(base: number){
    this.baseRecta = base
  }
  public establecerAlturaRecta(altura: number){
    this.alturaRecta = altura
  }
  calcularArea(): number{
    return this.baseRecta + this.alturaRecta;
  }
  calcularPerimetro(): number{
    return 2 * (this.baseRecta + this.alturaRecta)
  }
}
