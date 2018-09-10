import { AbstractClase } from "./claseAbstracta";

export class Rectangulo extends AbstractClase {
    baseRecta: any;
    alturaRecta: any;

    public establecerDatosRectangulo(datos) {
        this.baseRecta = datos.baseRecta;
        this.alturaRecta = datos.alturaRecta;
    }
    
    public calcularArea () {
        let area = this.baseRecta * this.alturaRecta;
        return area;
    }
    public calcularPerim() {
        let perimetro = 2 * (this.baseRecta + this.alturaRecta);
        return perimetro;
    }
}