/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite;//indice que especifica la ubicación del número a traer.
        int maxIntentos = 0; //cantidad de veces que se ha intentado la solicitud
        /**
        *el proceso se encierra dentro de un do while para que se ejecute al menos una vez
        **/
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número mayor de 0 que representa la cantidad de digitos a traer");

            limite = filtrarNumero(sc.next());//asígna la posición que se desea conocer
            for (int i = 0; i < limite; i++) {//recorrec las veces indicada
                System.out.print(CallFibonacci.writeFibonacci(i) + ", ");//imprime el resultado
            }
            maxIntentos++;//añade intentos
            System.out.println("maxintentos " + maxIntentos); //imprime la cantidad de intentos realizados
        } while (limite < 1 && maxIntentos < 4);//verifica si sigue en el loop
        if(maxIntentos > 3){//Si se han intentado la cantidad máxima de intentos se indica
            System.out.println("Ha realizado el número máximo de intentos. ");
        }
        System.out.println("Programa finalizado correctamente.");
    }

    /**
     * Filtra que el número sea valido o de lo contrario retorna 0 como error
     * @param numeroString
     * @return 
     */
    private static int filtrarNumero(String numeroString) {
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
