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
public class Perro extends Mascota{
    private String Raza;
    
    public Perro(String Raza, String Nombre, String Color) {
        super(Nombre, Color);
        this.Raza = Raza;
    }

    public Perro(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String descripcion() {
    return " Su Nombre es :"+Nombre+" \n Color es :"+Color+" \n Raza :"+Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
}
