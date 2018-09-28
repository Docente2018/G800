/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetro;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Figura4 {

    protected String nomFigura;
    protected float area;
    protected float perim;

    public void establecerNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

     String obtenerNomFigura() {
        return nomFigura;
    }

    public abstract void calcularArea();

    public abstract void calcularPerim();

    public float obtenerArea() {
        return area;
    }

    public float obtenerPerim() {
        return perim;
    }
}
