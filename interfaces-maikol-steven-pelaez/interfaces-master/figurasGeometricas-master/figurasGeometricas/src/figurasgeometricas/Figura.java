/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  figurasgeometricas;

/**
 *
 * @author ESTUDIANTE
 */
public  abstract class Figura implements EjecutaFigura{
    protected String nombreFigura;
    protected double area;
    protected double perimetro;

    public Figura() {
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

   
    public abstract double  calcularArea();
    public abstract double calcularPerimetro();
    
    
    
    
}
