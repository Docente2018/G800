export abstract class Figura {

    private nomFigura: string;
    private area: number;
    private perim: number;

    establecerNomFigura(nombre: string){
        this.nomFigura = nombre;
    }

    obtenerNomFigura(): string{
        return this.nomFigura;
    }

    abstract calcularArea();
    abstract calcularPerimetro();

    obtenerArea(): number{
        return this.area;
    }

    obtenerPerimetro(): number{
        return this.perim;
    }
}
