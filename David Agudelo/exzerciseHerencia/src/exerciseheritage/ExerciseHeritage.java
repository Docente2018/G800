/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseheritage;

import abc.Carro;
import abc.Transporte;
import abc.bicicleta;
import animal.Animal;
import animal.Perro;
import animal.Leon;
import exerciseheritage.figuraregular.figGeometrica;
import exerciseheritage.figuraregular.rectangulo;
import exerciseheritage.figuraregular.triangulo;

/**
 *
 * @author ESTUDIANTE
 */
public class ExerciseHeritage{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo cuadrado = new rectangulo();
        System.out.println("area cuadrado = " + Integer.toString(cuadrado.calcular(12, 12)));
        figGeometrica triangulo = new triangulo();
        System.out.println("area triangulo = " + Integer.toString(triangulo.calcular(12, 12)));
        
        
        Transporte carro = new Carro();
        Transporte bici = new bicicleta();
        carro.avanzar(" un kilomtro");
        bici.girarDerecha();
        bici.avanzar(" por la cicloruta");
        
        Animal perro = new Perro();
        Animal leon = new Leon();
        leon.rugir();
        perro.rugir();
        
    }
    
}
