import { AbstractClase } from "./claseAbstracta";

export class Circulo extends AbstractClase {
    valorPI = 3.14;
    Radio: any;

    public establecerDatosCirculo(radio) {
        this.Radio = radio;
    }
    
    public calcularArea () {
        let area = (this.Radio * this.Radio) * this.valorPI;
        return area;
    }
    public calcularPerim() {
        let perimetro = (this.Radio * 2) * this.valorPI;
        return perimetro;
    }
}