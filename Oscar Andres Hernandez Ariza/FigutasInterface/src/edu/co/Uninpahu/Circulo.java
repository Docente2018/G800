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
public class Circulo implements Figura2D {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public void mostraArea() {
        System.out.println("Area del circulo R=" + radio + ": "
                + Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("Perimetro del circulo de R=" + radio + ": "
                + Math.PI * 2 * radio);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
