/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.Uninpahu;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo implements Figura2D {

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void mostraArea() {
        System.out.println("Area del triangulo B=" + base + " A=" + altura
                + ": " + base * altura / 2);
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("Perimetro del triangulo rectangulo B=" + base + " A=" + altura
                + ": " +( base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))));
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
