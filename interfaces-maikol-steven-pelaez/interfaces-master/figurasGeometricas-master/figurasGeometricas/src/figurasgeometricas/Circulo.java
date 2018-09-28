/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import javax.crypto.Mac;

/**
 *
 * @author ESTUDIANTE
 */
public class Circulo extends Figura {

    private int radioCirc;

    public Circulo(int radioCirc) {
        this.radioCirc = radioCirc;
    }

   

    

    public int getRadioCirc() {
        return radioCirc;
    }

    public void setRadioCirc(int radioCirc) {
        this.radioCirc = radioCirc;
    }

    @Override
    public double calcularArea() {
        double totalArea = 0;
        totalArea = Math.PI * Math.pow(radioCirc, 2);
        return totalArea;
    }

    @Override
    public double calcularPerimetro() {
        double totalPerimetro = 0;
        totalPerimetro = 2 * (Math.PI*radioCirc);
        return totalPerimetro;
    }

    @Override
    public void ejecutarFigura() {
        System.out.println("Figura: " + getNombreFigura() + "\n");
        System.out.println("Area del " + getNombreFigura() + ": " + calcularArea() + "\n");
        System.out.println("Perimetro del " + getNombreFigura() + ": " + calcularPerimetro() + "\n");
    }

}
