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
public abstract class Persona {
    protected String Nombre;
    protected String Apellido;
    protected String Documento;

    public Persona(String Nombre, String Apellido, String Documento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
    }

    public Persona(){}
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    
    public abstract String Saludar();
    
    
}
