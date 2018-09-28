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
public class Cuadrado4 extends Figura4 {

    private float ladoCuad;

    public void establecerLadoCuad(float ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        super.area = (float) Math.pow(this.ladoCuad, 2);
    }

    @Override
    public void calcularPerim() {
        super.perim = ladoCuad * 4;
    }

}
