/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serieFibonacci;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fibonacci {
    public static void main(String[] args) {
         int limite;
         int maxIntentos = 0;
         int contador =1;
            
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el numero a encontrar en la serie ");

            limite = validar(sc.next());
            System.out.println("_______________________________________________________________");
            for (int i = 0; i < limite; i++) {
                System.out.println(contador++ +")"+fibo.fibonacci(i));
            }
            maxIntentos++;
            System.out.println("Intentos " + maxIntentos);
        } while (limite < 1 && maxIntentos < 3);
        
        
        if(maxIntentos > 3){
            System.out.println("lo siento :( ha realizado el numero de intentos permitidos");
        }
        System.out.println("FIN");
    }

    /**
    valida que los numeros ingresados sean validos
     */
    private static int validar(String numeroString) {
        int numero;
        try {
            numero = Integer.parseInt(numeroString);
        } catch (Exception e) {
            System.out.println("El dato ingresado (" + numeroString + ") no corresponde a un número: ");
            return 0;
        }
        if (numero < 1) {
            System.out.println("El número ingresado (" + numero + ") es menor o igual a cero.");
            return 0;
        }
        return numero;
    }
       
    }
    
