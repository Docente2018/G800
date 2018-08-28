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
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arroz arroz = new Arroz(5200.00, 580.12 , 16.0);
        System.out.println("El valor neto del arroz es: $" + arroz.calcularValorNeto());
        System.out.println("El peso neto en kilogramos del arroz es: " + arroz.getPesoNetoKg() + "Kg");
        System.out.println("El arroz pertenece a la categoria: " + arroz.categoria());
        
        System.out.println("");
        
        Leche leche = new Leche(2500.2, 1000.00 , 19.0);
        System.out.println("El valor neto de la leche es: $" + leche.calcularValorNeto());
        System.out.println("El volumen neto en litros de la leche es: " + leche.getPesoNetoKg() + "L");
        System.out.println("La leche pertenece a la categoria: " + leche.categoria());
    }
    
}
