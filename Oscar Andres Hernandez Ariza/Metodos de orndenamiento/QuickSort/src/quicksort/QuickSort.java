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
    protected static List<Integer> listaElementos = new ArrayList();

    /**
     * Metodo main para ejecucion de la clase
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarLista();//lee 10 elementos
        System.out.println("Elementos Ingresados:");
        imprimirLista(listaElementos);//imprimo la lista ingresada por el usuario sin ordenar

        quickSort(listaElementos);//almaceno los numero ordenados
        System.out.println("Elementos Ordenados:");
        imprimirLista(listaElementos);//imprimo en consola los numero ya ordenados
    }

    /**
     * llena la lista con los elementos del usuario
     */
    public static void llenarLista() {
        boolean noSalir = true;//me indica si se seguira leyendo elementos del teclado
        int items = 0;
        listaElementos.clear();//limpio la lista para no tener problemas de registros
        Scanner teclado;//declaro un Scanner para la consola

        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            try {
                System.out.println("METODO DE QUICKSORT");
                System.out.print("Ingrese la cantidad de items de la lista: ");
                items = teclado.nextInt();//intento optener un numero entero
                noSalir = false;//indica que se salda del ciclo
            } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                System.err.println("El valor ingresado no es valido.");
            }
        } while (noSalir);

        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            try {
                System.out.println("  C-Ingresar datos por consola");
                System.out.println("  R-Ingresar datos por consola");
                switch (teclado.next()) {
                    case "C":
                    case "c": {
                        leerPorConsola(items);
                        break;
                    }
                    case "R":
                    case "r": {
                        for (int i = 0; i < items; i++) {
                            listaElementos.add((int) Math.floor(Math.random() * 100));
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
        boolean noSalir = true;//me indica si se seguira leyendo elementos del teclado
        System.out.println("Ingrese " + items + " numeros que desee ordenar");
        do {
            teclado = new Scanner(System.in);//refresco el scanner por problemas con el ciclo 
            if (listaElementos.size() >= items) {//establesco un limite de 10 elementos para leer, puede ser cambiado facilmente
                noSalir = false;//indico que saldra de la lectura
            } else {
                try {
                    System.out.print("Ingrese un numero: ");
                    listaElementos.add(teclado.nextInt());//intento optener un numero entero
                } catch (java.util.InputMismatchException e) {//controlo cuando no se ingresa un numero entero
                    System.err.println("El valor ingresado no es valido.");
                }
                noSalir = true;
            }
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
     * @param entrada lista a la cual se le ordenara sus elementos
     * @return lista ordenada de los elementos iniciales
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
