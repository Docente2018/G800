import { Component } from '@angular/core';

import { CuadradoService } from './clases/cuadrado.service';
import { TrianguloService } from './clases/triangulo.service';
import { RectanguloService } from './clases/rectangulo.service';
import { CirculoService } from './clases/circulo.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(
    private triangulo: TrianguloService,
    private cuadrado: CuadradoService,
    private rectangulo: RectanguloService,
    private circulo: CirculoService
  ){}
  title = 'Corte1Prueba';
  public figura: number;  
  public lado: number;
  public lado1: number;
  public lado2: number;
  public lado3: number;
  public area: any;
  public perimetro: any;
  public nombre: string;
  public radio: number;
  public baseTria: number;
  public alturaTria: number;

  public base: number;
  public altura: number;

  calcularFigura(){
    if(this.figura == 1){
      this.triangulo.establecerAlturaTria(this.alturaTria);
      this.triangulo.establecerBaseTria(this.baseTria);
      this.triangulo.establecerLadoA(this.lado1);
      this.triangulo.establecerLadoB(this.lado2);
      this.triangulo.establecerLadoC(this.lado3);
      this.area = this.triangulo.calcularArea();
      this.perimetro = this.triangulo.calcularPerimetro();
      this.nombre = "Triangulo";      
    }
    if(this.figura == 2){
      this.cuadrado.establecerLadoCuad(this.lado);
      this.area = this.cuadrado.calcularArea();
      this.perimetro = this.cuadrado.calcularPerimetro();
      this.nombre = "Cuadrado";
    }
    if(this.figura == 3){
      this.rectangulo.establecerBaseRecta(this.base);
      this.rectangulo.establecerAlturaRecta(this.altura);
      this.area = this.rectangulo.calcularArea();
      this.perimetro = this.rectangulo.calcularPerimetro();
      this.nombre = "Rectangulo"
    }
    if(this.figura == 4){
      this.circulo.establecerRadioCirc(this.radio);
      this.area = this.circulo.calcularArea();
      this.perimetro = this.circulo.calcularPerimetro();
      this.nombre = "Circulo"
    }
  }

  limpiar(){
    this.nombre = "";
  }
}
