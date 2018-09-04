/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkFiguras;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Figura {
    String nomFigura;
    protected int area;
    protected int perimetro;
    
    public abstract void establecerNomFigura();
    public abstract void obtenerNomFigura();
    public abstract void calcularArea();
    public abstract void calcularPerim();
    public abstract void obtenerArea();
    public abstract void obtenerPerim();

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }
    
    
}
