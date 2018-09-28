import { Injectable } from '@angular/core';
import { Figura } from './figura';

@Injectable({
  providedIn: 'root'
})
export class TrianguloService extends Figura{
  baseTria: number;
  alturaTria: number;
  ladoA: number;
  ladoB: number;
  ladoC: number;
  establecerBaseTria(base: number){
    this.baseTria = base;
  }
  establecerAlturaTria(altura: number){
    this.alturaTria = altura;
  }
  establecerLadoA(lado1: number){
    this.ladoA = lado1
  }
  establecerLadoB(lado2: number){
    this.ladoB = lado2
  }
  establecerLadoC(lado3: number){
    this.ladoC = lado3
  }
  calcularArea(): number{
    return (this.baseTria * this.alturaTria) / 2
  }
  calcularPerimetro(): number{
    return this.ladoA + this.ladoB + this.ladoC
  }
}
