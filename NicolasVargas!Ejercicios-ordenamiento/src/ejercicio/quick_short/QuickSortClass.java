/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Nicolas Vargas
 */
package ejercicio.quick_short;

import java.util.Random;
import java.util.Scanner;

public class QuickSortClass {
    
    // Metodo que ordena los numeros.
    public static void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        // Condicional que valida si el numero de la izquierda es menor al de la derecha.
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }

    // Metodo main donde se ejecuta la aplicación
    public static void main(String[] args) {
        // Variable entera que guarda la longitud del arreglo
        int longitud;
        // Declaración de scanner
        Scanner oscanner = new Scanner(System.in);
        System.out.println("----Bienvenido al metodo quickshort----");
        System.out.println("Ingrese la longitud de la lista");
        longitud = oscanner.nextInt();
       // System.out.println("Vector desordenado");
        int[] numeros = new int[longitud];
        Random rnd = new Random();
        System.out.println("Vector desordenado");
        System.out.println("//////////////////////////////");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
        }   
        // Envia los parametros al metodo para ordenarlos
        QuickSortClass.quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

    }
}