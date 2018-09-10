import { AbstractClase } from "./claseAbstracta";

export class Cuadrado extends AbstractClase {
    Lado: any;

    public establecerDatosCuadrado(lado) {
        this.Lado = lado;
    }
    
    public calcularArea () {
        let area = this.Lado * this.Lado;
        return area;
    }
    public calcularPerim() {
        let perimetro = this.Lado * 4;
        return perimetro;
    }
}