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
        short intentos = 0;
        boolean complete = true;

        Scanner teclado;
        do {
            System.out.print("cuantos numeros desea :");
            try {
                teclado = new Scanner(System.in);
                cantidad = teclado.nextInt();//lee la cantidad de series que se quiere calcular
                if (cantidad > 92 || cantidad < 0) {// si se calculan mas de 92 
                    System.out.println("No se puede calcular mas de 92 numeros ni cantidades negativos");
                } else {
                    for (int i = 0; i < cantidad; i++) {//calcula e imprime la serie
                        System.out.print(" " + f[0]);
                        total = (f[1] + f[0]);
                        f[0] = f[1];
                        f[1] = total;
                    }
                    System.out.println("");//salto de linea final
                    complete = false;
                }
            } catch (java.util.InputMismatchException e) {//controla si se ingresa alguna letra en la lectura
                if (!(intentos < 2)) {
                    System.err.println("Se a exedido el maximo de intentos");
                } else {
                    System.out.println("Por favor ingrese un numero entero");
                }
            }
            intentos++;
        } while (intentos < 3 && complete);

    }

}
