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
public class FiguraRegular {
    
    int lados;
    protected int area;

    public FiguraRegular(int lados){
        this.lados = lados;
        this.area = 0;
    }
    
    public int verArea(){
        return this.area;
    }    
}
