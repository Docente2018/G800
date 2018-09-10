import { AbstractClase } from "./claseAbstracta";

export class Triangulo extends AbstractClase {

    baseTria: any;
    alturaTria: any;
    ladoA: any;
    ladoB: any;
    ladoC: any;
    public establecerBaseTria(base) {
        this.baseTria = base;
    }
    public establecerDatosDelTriangulo(objetoTriangulo) {
        console.log(objetoTriangulo)
        this.baseTria = objetoTriangulo.baseTria;
        this.alturaTria = objetoTriangulo.alturaTria;
        this.ladoA = objetoTriangulo.LadoA;
        this.ladoB = objetoTriangulo.LadoB;
        this.ladoC = objetoTriangulo.LadoC;
    }
    public calcularArea () {
        let area = this.baseTria * this.alturaTria / 2;
        return area;
    }
    public calcularPerim() {
        let perimetro = Number(this.ladoA) + Number(this.ladoB) + Number(this.ladoC);
        return perimetro;
    }
}