/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.prueba.co;

/**
 *
 * @author ESTUDIANTE
 */
public class Loro extends Mascota implements Calcular{
    private int Pesokg;

    public Loro(int Pesokg, String Nombre, String Color) {
        super(Nombre, Color);
        this.Pesokg = Pesokg;
    }

    public Loro(int Pesokg) {
        this.Pesokg = Pesokg;
    }

    
    public int getPesokg() {
        return Pesokg;
    }

    public void setPesokg(int Pesokg) {
        this.Pesokg = Pesokg;
    }

    
    @Override
    public String descripcion() {
         return " Su Nombre es :"+Nombre+" \n Color es :"+Color+" \n Peso es :"+Pesokg+" KG";
    }

    @Override
    public String conversionLibra() {
     return "El peso en   :"+lg*Pesokg+" Lb ";
    }
    
    
}
