import { Injectable } from '@angular/core';
import { Figura } from './figura';

@Injectable({
  providedIn: 'root'
})
export class CirculoService extends Figura{

  private radioCirc: number;
  establecerRadioCirc(radio: number){
    this.radioCirc = radio;
  }
  calcularArea(): any{
    return Math.PI * Math.pow(this.radioCirc, 2);
  }
  calcularPerimetro(): any{
    return 2 * Math.PI * this.radioCirc;
  }
}
