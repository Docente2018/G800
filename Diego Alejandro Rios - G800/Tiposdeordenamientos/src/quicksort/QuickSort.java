/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class QuickSort {
    public static void quickSort(int[] vector, int izq, int der) {
         //1. Elegir el pivote
        int pivote = vector[izq];
        int i = izq;
        int j = der;
          //- i para controlar los elementos a la izquierda del pivote
          //- j para controlar los elementos a la derecha del pivote
        int auxIntercambio;
          while (i < j) {
            //mientras que el elemento vector[i] sea menor o igual al pivote se aumenta el valor de i
          while (vector[i] <= pivote && i < j) {
                i++;
            }
            //mientras que el elemento vector[j] sea mayor al pivote se desminuye el valor de j
         while (vector[j] > pivote) {
                j--;
            }
          if (i < j) {
              //siempre y cuando i sea menor a j, se hace un cambio de los elementos
                //nota: auxIntercambio podría estar declarada aquí ya que no tiene otro alcance
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
     //es menor o igual al pivote, actualizamos entonces la posición del pivote, mandando vector[j] 
        vector[izq] = vector[j];
        vector[j] = pivote;        
        if (izq < j - 1) {            
            quickSort(vector, izq, j - 1);
        }
        if (j + 1 < der) {
           
            quickSort(vector, j + 1, der);
        }
    }

    public static void main(String[] args) {
        
        String num =JOptionPane.showInputDialog("Ingrese el tamaño de la cadena ");
        int nume = Integer.parseInt(num);
        // se solicita la cantidad que tendra la cadena para estiomar el tmaaño de la matriz
        int[] numeros = new int[nume];
        Random rnd = new Random();
        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
            // Se crean todos los números aleatorios y se imprime la cadena original
        }   
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");
         // Se ordena la cadena utilizando el metodo creado anteriormente que es quicksort
        }

    }
}
