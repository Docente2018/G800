/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Circulo {
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
    public double CalcularArea(){
        return  Math.PI *(radioCirc * radioCirc);
    }
    public double CalcularPerimetro(){
        return 2 * (Math.PI * radioCirc);
    }
    
    
    
}
