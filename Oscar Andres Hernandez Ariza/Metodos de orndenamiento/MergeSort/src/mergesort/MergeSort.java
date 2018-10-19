/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MergeSort {

    private static Integer elementos[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarLista();//lee 10 elementos
        System.out.println("Elementos Ingresados:");
        imprimirLista(elementos);//imprimo la lista ingresada por el usuario sin ordenar
        mergeSort(elementos, elementos.length);
        System.out.println("Elementos Ordenados:");
        imprimirLista(elementos);//imprimo en consola los numero ya ordenados
    }

    public static void mergeSort(Integer[] arr, int logitudArr) {
        if (logitudArr < 2) {//si solo tiene un elemento o ninguno retorna vacio
            return;
        }
        int centro = logitudArr / 2;//encuentro el numero central del arreglo
        Integer[] arrIzquierdo = new Integer[centro];//arreglo izquierdo
        Integer[] arrDerecho = new Integer[logitudArr - centro];//arreglo derecho

        for (int i = 0; i < centro; i++) {//divido el arriglo
            arrIzquierdo[i] = arr[i];
        }
        for (int i = centro; i < logitudArr; i++) {//divido el arriglo
            arrDerecho[i - centro] = arr[i];
        }
        mergeSort(arrIzquierdo, centro);//divido el arriglo
        mergeSort(arrDerecho, logitudArr - centro);//divido el arriglo
        //el arreglo esta totalmente dividio en arreglos de un elemento
        merge(arr, arrIzquierdo, arrDerecho, centro, logitudArr - centro);//organizo cada fracmento de arreglo que encuento
    }

    public static void merge(Integer[] arr, Integer[] arrIzquierdo, Integer[] arrDerecho, Integer longIzquierdo, Integer longDerecho) {

        int i = 0, d = 0, f = 0;//variable que uso como contadores

        while (i < longIzquierdo && d < longDerecho) {//Se dael caso de que los dos arreglos tengan mas de un elemento

            if (arrIzquierdo[i] < arrDerecho[d]) {//Compara los primeros elementos de ambos arreglos
                arr[f++] = arrIzquierdo[i++];//agrega el elemetro del arreglo izquierdo
            } else {
                arr[f++] = arrDerecho[d++];//agrega el elemetro del arreglo derecho
            }
        }
        while (i < longIzquierdo) {//si polo tengo elementos en el arreglo izquierdo
            arr[f++] = arrIzquierdo[i++];//agrega los elemetros del arreglo
        }

        while (d < longDerecho) {//si polo tengo elementos en el arreglo derecho
            arr[f++] = arrDerecho[d++];//agrega los elemetros del arreglo
        }
    }

    /**
     * llena la lista con los elementos del usuario
     */
    public static void llenarLista() {
        boolean noSalir = true;//me indica si se seguira leyendo elementos del teclado     
        Scanner teclado;//declaro un Scanner para la consola
        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            try {
                System.out.println("METODO DE MERGESORT");
                System.out.print("Ingrese la cantidad de items de la lista: ");
                elementos = new Integer[teclado.nextInt()];//intento optener un numero entero
                noSalir = false;//indica que se salda del ciclo
            } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                System.err.println("El valor ingresado no es valido.");
            }
        } while (noSalir);

        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            try {
                System.out.println("  C-Ingresar datos por consola");
                System.out.println("  R-Generar Numeros Random");
                switch (teclado.next()) {
                    case "C":
                    case "c": {
                        leerPorConsola(elementos.length);
                        break;
                    }
                    case "R":
                    case "r": {
                        for (int i = 0; i < elementos.length; i++) {
                            elementos[i] = ((int) Math.floor(Math.random() * 100));
                        }
                        break;
                    }
                    default: {
                        noSalir = true;
                        continue;
                    }
                }
                noSalir = false;//indica que se salda del ciclo
            } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                System.err.println("El valor ingresado no es valido.");
            }
        } while (noSalir);

        System.out.println("");
    }

    public static void leerPorConsola(int items) {
        Scanner teclado;//declaro un Scanner para la consola
        int i = 0;
        System.out.println("Ingrese " + items + " numeros que desee ordenar");
        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            try {
                System.out.print("Ingrese un numero: ");
                elementos[i] = teclado.nextInt();//intento optener un numero entero
                i++;
            } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                System.err.println("El valor ingresado no es valido.");
            }
        } while (i < elementos.length);
    }

    public static void imprimirLista(Integer[] entrada) {
        for (Integer i : entrada) {//itero la lista
            System.out.print("{" + i + "}");//imprimo el valor
        }
        System.out.println("");
    }
}
