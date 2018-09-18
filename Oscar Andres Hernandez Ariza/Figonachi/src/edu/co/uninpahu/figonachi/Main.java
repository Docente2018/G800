/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.uninpahu.figonachi;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long f[] = {0L, 1L};// matiz inicial
        int cantidad = 0;
        Long total = 0L;

        System.out.print("cuantos numeros desea :");
        Scanner teclado = new Scanner(System.in);
        try {
            cantidad = teclado.nextInt();//lee la cantidad de series que se quiere calcular
            if (cantidad > 92) {// si se calculan mas de 92 
                System.out.println("no se puede calcular mas de 92 numeros");
            } else {
                for (int i = 0; i < cantidad; i++) {//calcula e imprime la serie
                    System.out.print(" " + f[0]);
                    total = (f[1] + f[0]);
                    f[0] = f[1];
                    f[1] = total;
                }
                System.out.println("");//salto de linea final
            }
        } catch (java.util.InputMismatchException e) {//controla si se ingresa alguna letra en la lectura
            System.out.println("por favor ingrese un numero entero");
        }

    }

}
