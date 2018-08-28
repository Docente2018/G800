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
public class Cliente extends Persona {

    private String CodigoCliente;

    public Cliente(String Nombre, String Apellido, String Documento) {
        super(Nombre, Apellido, Documento);
    }
   public Cliente(){}

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }
    
    
    @Override
    public String Saludar() {
       return "Mi nombre es "+this.Nombre+" Mi apellido es "+this.Apellido+" y mi codigoCliente es:"+this.CodigoCliente;
    }
    
}
