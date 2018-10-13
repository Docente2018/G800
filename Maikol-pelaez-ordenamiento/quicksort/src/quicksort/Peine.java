/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author maikol
 */
//herncia de la clase Molde
public class Peine extends Molde {

    //contrcutor 
    public Peine(int numero, String nombre) {
        //reutilizar el constructor de la clase padre
        super(numero, nombre);
    }

    // metodo de ordenacion que recibe el array a ordenar
    public int[] ordenar(int[] array) {
        //se define la variable i y j con el tamaño del array
        int i = 0;
        int j = array.length - 1;

        //se valida si j > 1 para que el repita el ciclo de ordenacion del array
        while (j > 1) {
            //se disminulle la variable j--;
            j--;
            //if para que recorra todo el array sin problema
            if (j < 1) {
                j = 1;
            }

            //ciclo for que nos permitira evaluar el array dependiendo su posicion
            for (int k = 0; k < array.length - j; k++) {

                /*al recorrer el ciclo se evalua cada vez el array[k] es mAyor para
                ordenar el array de menor a mayor xd
                 */
                if (array[k] > array[k + j]) {

                    int tem = array[k];
                    array[k] = array[k + j];
                    array[k + j] = tem;
                }

            }

        }

        //se retorna el array ordenado
        return array;
    }

}
