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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1.0);
        mostrarArea(circulo);
        mostrarPerimetro(circulo);
        System.out.println("");
        
        Cuadrado cuadrado = new Cuadrado(1.0);
        mostrarArea(cuadrado);
        mostrarPerimetro(cuadrado);
        System.out.println("");
        
        Triangulo triangulo = new Triangulo(1.0, 1.0);
        mostrarArea(triangulo);
        mostrarPerimetro(triangulo);

    }

    public static void mostrarArea(Figura2D f) {
        f.mostraArea();
    }

    public static void mostrarPerimetro(Figura2D f) {
        f.mostrarPerimetro();
    }
}
