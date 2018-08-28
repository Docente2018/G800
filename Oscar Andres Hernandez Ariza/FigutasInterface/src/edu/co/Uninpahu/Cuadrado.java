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
public class Cuadrado implements Figura2D {

    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void mostraArea() {
        System.out.println("Area de cuadrado L=" + lado + ": " + Math.pow(lado, 2));
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("Perimetro de cuadrado L=" + lado + ": " + lado * 4);
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

}
