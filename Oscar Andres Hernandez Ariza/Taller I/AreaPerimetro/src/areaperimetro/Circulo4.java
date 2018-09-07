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
public class Circulo4 extends Figura4 {

    private float radioCirc;

    public void establecerRadioCirc(float radioCirc) {
        this.radioCirc = radioCirc;
    }

    @Override
    public void calcularArea() {
        super.area = (float) Math.PI * (float) Math.pow(this.radioCirc, 2);
    }

    @Override
    public void calcularPerim() {
        super.perim = 2 * (float) Math.PI * this.radioCirc;
    }

}
