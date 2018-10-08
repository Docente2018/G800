/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class QuickSort {

    /**
     * Lista en la que se guardaran los numero ingresado por el usuario
     */
    protected static List<Integer> listaInicial = new ArrayList();

    /**
     * Metodo main para ejecucion de la clase
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarLista(10);//lee 10 elementos
        List<Integer> numeroOrdenados = quickSort(listaInicial);//almaceno los numero ordenados
        imprimirLista(numeroOrdenados);//imprimo en consola los numero ya ordenados
    }

    /**
     * llena la lista con los elementos del usuario
     *
     * @param items cantidad de numero que se quiere leer
     */
    public static void llenarLista(int items) {
        boolean noSalir = true;//me indica si se seguira leyendo elementos del teclado
        listaInicial.clear();//limpio la lista para no tener problemas de registros
        Scanner teclado;//declaro un Scanner para la consola
        System.out.println("Ingrese 10 numero entero que desee ordenar");
        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo
            if (listaInicial.size() >= items) {//establesco un limite de 10 elementos para leer, puede ser cambiado facilmente
                noSalir = false;//indico que saldra de la lectura
            } else {
                try {
                    System.out.print("Ingrese un numero: ");
                    listaInicial.add(teclado.nextInt());//intento optener un numero entero
                } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                    System.err.println("El valor ingresado no es valido.");
                }
            }
            System.out.println("");
        } while (noSalir);
    }

    /**
     * Imprime todos los elementos de una lista
     *
     * @param entrada se espera una lista de enteros
     */
    public static void imprimirLista(List<Integer> entrada) {
        for (Integer integer : entrada) {//itero la lista
            System.out.print("{" + integer + "}");//imprimo el valor
        }
        System.out.println("");
    }

    /**
     * Ordena de menor a mayor con QuickSort
     *
     * @param entrada
     * @return
     */
    public static List<Integer> quickSort(List<Integer> entrada) {
        if (entrada.isEmpty()) {//si la lista llega vacia se a llegado al caso Base
            return entrada;
        }
        List<Integer> izquierda = new ArrayList();//lista de elementos menores que el pivote
        List<Integer> derecha = new ArrayList();//lista de elementos mayores que el pivote                                                                             
        Integer pivote = null;//declaro el pivote
        for (Integer integer : entrada) {//itero la lista de entrada
            if (pivote == null) {//verifico si existe un pivote
                pivote = integer;//asigno un pivote
                continue;//salgo de la iteracion actual
            }
            if (pivote <= integer) {
                derecha.add(integer);//si es mayo o igual que pivote
            } else {
                izquierda.add(integer);//si es menor o igual que pivote
            }
        }
        quickSort(izquierda);//realizo quickSort hasta allar el caso Base
        quickSort(derecha);//realizo quickSort hasta allar el caso Base
        entrada.clear();//reutilizo la lista de entrada
        //añado las listas de izquierda, pivote y derecha
        entrada.addAll(izquierda);
        entrada.add(pivote);
        entrada.addAll(derecha);

        return entrada;//retorno lista ordenada de menor a mayor
    }

}
