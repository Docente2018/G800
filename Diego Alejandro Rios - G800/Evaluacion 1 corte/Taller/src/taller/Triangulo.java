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
public class Triangulo implements AreaFiguras
{
    private double base;
    private double altura;
    private double ladoa;
    private double ladob;
    private double ladoc;
    private double areaTriangulo;
    private double perimetrotriangulo;

    public Triangulo(double base, double altura, double ladoa, double ladob, double ladoc) 
    {
        this.base = base;
        this.altura = altura;
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
public double getladoa() 
    {
        return ladoa;
    }

    public void setladoa(double ladoa)
    {
        this.ladoa = ladoa;
    }
    public double getladob() 
    {
        return ladob;
    }

    public void setladob(double ladob)
    {
        this.ladob = ladob;
    }
    public double getladoc() 
    {
        return ladoc;
    }

    public void setladoc(double ladoc)
    {
        this.ladoc = ladoc;
    }
    

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }
    public double getperimetroTriangulo() 
    {
        return perimetrotriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }
@Override
    public void perimetro() 
    {
        perimetrotriangulo = ladoa + ladob + ladoc;
    }     
    
}
