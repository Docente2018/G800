/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuadrado extends Figura{

    private int ladoCuad;

    public Cuadrado(int ladoCuad) {
        super();
        this.ladoCuad = ladoCuad;
    }

    public int getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(int ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public double calcularArea() {
         double totalArea=0;
         totalArea=ladoCuad*ladoCuad;
         return totalArea;
    }

    @Override
    public double calcularPerimetro() {
        double totalPerimetro=0;
        totalPerimetro=4*ladoCuad;
         return totalPerimetro;
    }

    @Override
    public void ejecutarFigura() {
        System.out.println("Figura: " + getNombreFigura() + "\n");
        System.out.println("Area del " + getNombreFigura() + ": " + calcularArea() + "\n");
        System.out.println("Perimetro del " + getNombreFigura() + ": " + calcularPerimetro() + "\n");
    }
    
    
    
  
    
    
    
}
