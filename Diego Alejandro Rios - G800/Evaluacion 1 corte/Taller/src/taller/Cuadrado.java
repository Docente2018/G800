/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuadrado implements AreaFiguras
{
    //Declaro una variable privada de tipo double para el lado del cuadrado
    private double lado;
    //Declaro una variable privada de tipo double para el area del cuadrado
    private double areaCuadrado;
    private double perimetrocuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    } 
    
    public double getperimetroCuadrado() 
    {
        return perimetrocuadrado;
    }  
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
        
    }
@Override
    public void perimetro() 
    {
        perimetrocuadrado = 4 * lado;
        
    }    
}