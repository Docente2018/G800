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
public class Cuadrado extends ClaseAbstract {

    public double ladoCuad;

    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    
    public void estableLadoCuadrado(){}

    @Override
    public double calcularArea() {
       double lad = this.ladoCuad;
       return lad*lad;
    }

    @Override
    public double calcularPerim() {
      return this.ladoCuad * 4;
    }
    
}
