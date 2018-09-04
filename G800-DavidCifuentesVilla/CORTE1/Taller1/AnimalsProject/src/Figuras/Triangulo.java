/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends FiguraRegular{

    public Triangulo(int lados) {
        super(lados);
    }
    
    public void calcularArea(){
        this.area = (this.lados * this.lados)/2;
    }
}
