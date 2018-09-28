/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacioncorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Circulo extends ClaseAbstract {

    public double radioCirculo;
 double pi = 3.1416;
    public double getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    @Override
    public double calcularArea() {
       
        double radcir = this.radioCirculo * this.radioCirculo;
        return (double) (pi * radcir);
    }

    @Override
    public double calcularPerim() {
       double radcir = this.radioCirculo * this.radioCirculo;       
    return (double) (pi* radcir);
    }
}
