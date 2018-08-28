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
public abstract class Mascota {
    protected String Nombre;
    protected String Color;
    

    public Mascota(String Nombre, String Color) {
        this.Nombre = Nombre;
        this.Color = Color;
       
    }
    
    public Mascota(){}
    
    public abstract String descripcion();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

   
    
}
