/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.*;

/**
 *
 * @author maikol
 */
//herencia de clase molde
public class Quicksort extends Molde {

    public Quicksort(int numero, String nombre) {
        super(numero, nombre);
    }

    // el metodo ordenar recibe el primero=0, ultimo que es el tamaño del array
    public int[] ordenar(int primero, int ultimo, int[] array) {

        //se iguala rimero, utlmo con las variables i,j
        int i = primero;
        int j = ultimo;
//se define una variable central sacando el promedio del array y sacar el pivote centrado.
        int central = array[(ultimo + primero) / 2];

        /*se realiza un ciclo do while para validar si la variable j se a diminudio si no 
        se repetira el ciclo asta cumplir con la condicion
         */
        do {
            //se evalua el pivote con el array[i++] si cumple i aumenta en 1
            while (central > array[i]) {
                i++;
            }
            //se evalua el pivote con el array[j] si pivote es menor j disminulle en 1
            while (central < array[j]) {

                j--;
            }

            //se valida si i<=j para cambiar la posicion del array y se valla ordenando.
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);

        //por ultimo se realiza la recursibidad del metodo ordenar para hacer sus ultimos ordenamientos.
        if (primero < j) {

            ordenar(primero, j, array);
        }
        if (ultimo > i) {

            ordenar(i, ultimo, array);
        }

        // se retorna el array ordenado.
        return array;
    }

}
