/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ESTUDIANTES
 */
public class Leche implements Productos{
    
    private double precio = 0;
    private double peso = 0;
    private double IVA = 0;
    
    public Leche(Double p_precio, Double p_peso, Double p_IVA){
        this.precio = p_precio;
        this.peso = p_peso;
        this.IVA = p_IVA;
    }
    
    public double getPesoNetoKg(){
        return this.peso / 1000;
    }

    @Override
    public double calcularValorNeto() {
        return this.precio + (this.precio * (this.IVA / 100));
    }

    @Override
    public String categoria() {
        return "Lácteos";
    }
}
