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
public class Circulo implements AreaFiguras 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;
    private double perimetrocirculo;
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getAreaRadio() 
    {
        return areaRadio;
    }
        public double getperimetroradio() 
    {
        return perimetrocirculo;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * (radio * radio);
    }
@Override
    public void perimetro() 
    {
        perimetrocirculo = 2*(pi * radio);
    }    
}