/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Radix {

    private static Integer elementos[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarLista();//lee 10 elementos
        System.out.println("Elementos Ingresados:");
        imprimirLista(elementos);//imprimo la lista ingresada por el usuario sin ordenar
        radix(elementos);
        System.out.println("Elementos Ordenados:");
        imprimirLista(elementos);//imprimo en consola los numero ya ordenados
    }

    /**
     *Ordena los elementos de manera acendente incluyendo los negativos
     * @param arr el Arreglo de numeros que se quiere ordenar
     */
    public static void radix(Integer[] arr) {
        Integer[] arr1 = new Integer[arr.length];//declaro un areglo auxiliar
        int longMax = 0;//esta variable
        //este bloque de codigo es usado para determinar cuantos digitos de requiere ordenar
        for (Integer num : arr) {
            for (int j = 0;; j++) {//se genera un ciclo infinito que se rompera cuando se sobrepase la cantidad de digitos del numero
                if (Math.abs(num / Math.pow(10, j)) < 1) {//si la parte entera de la divicion en base 10 es menor que 1 se encuenta la cantidad maxima de digitos
                    if (longMax < j) {
                        longMax = j;//se asigna la cantidad maxima de digitos
                    }
                    break;
                }
            }
        }
        
        int cont;//contador para moverse por el nuevo arreglo
        for (int k = 0; k <= longMax; k++) {//sirve para comparar digito por digito hasta el mas grande que se encuentre
            cont = 0;//reset contador
            for (int i = -9; i <= 9; i++) {//revisa desde los digitos negativos hasta los digitos positivos
                for (Integer arr2 : arr) {
                    if (((int) (arr2 / Math.pow(10, k)) % 10) == i) {//compara si el numero pertenece al digito que se esta comparando
                        arr1[cont++] = arr2;//agrego el numero al arreglo parcialmente ordenado
                    }
                }
            }
            System.arraycopy(arr1, 0, arr, 0, arr.length);//clono el arreglo auxiliar en el arreglo principal
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
                System.out.println("METODO DE RADIX SORT");
                System.out.print("Ingrese la cantidad de items de la lista: ");
                elementos = new Integer[teclado.nextInt()];//intento optener un numero entero
                noSalir = false;//indica que se salda del ciclo
            } catch (java.util.InputMismatchException | java.lang.NegativeArraySizeException e) {//controlo cuando no se ingresa un numero entero
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
                            elementos[i] = ((int) Math.floor(Math.random() * 1000));//genera un numero random
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

    /**
     *
     * @param items
     */
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

    /**
     *
     * @param entrada
     */
    public static void imprimirLista(Integer[] entrada) {
        for (Integer i : entrada) {//itero la lista
            System.out.print("{" + i + "}");//imprimo el valor
        }
        System.out.println("");
    }
}
