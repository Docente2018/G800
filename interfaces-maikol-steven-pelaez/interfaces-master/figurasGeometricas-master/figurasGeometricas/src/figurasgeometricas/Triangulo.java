/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends Figura{

    private int baseTria;
    private int alturaTria;
    private int ladoA, ladoB, ladoC;
    

    public Triangulo(int baseTria, int alturaTria, int ladoA, int ladoB, int ladoC) {
        super();
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    
    
    public int getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(int baseTria) {
        this.baseTria = baseTria;
    }

    public int getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(int alturaTria) {
        this.alturaTria = alturaTria;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    

  

    @Override
    public double calcularArea() {
       double totalArea=0;
         totalArea=(baseTria*alturaTria)/2;
         return totalArea;
    }

    @Override
    public double calcularPerimetro() {
     double totalPerimetro=0;
     
     totalPerimetro=ladoA+ladoB+ladoC;
     
     return totalPerimetro;
    }
    
      @Override
    public void ejecutarFigura() {
       JOptionPane.showMessageDialog(null, ""
               + "Figura: "+getNombreFigura()+ "\n"
               + "Area del Triangulo: " +calcularArea()+ "\n +"
               + "Perimetro del Triangulo: "+calcularPerimetro() +"\n");
        
      
    }
    
}
