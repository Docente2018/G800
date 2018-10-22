/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmetods;

/**
 *
 * @author ESTUDIANTES
 */

public class Insertion {
    
    
  public static void main(String[] args) {
      Insertion insertion = new Insertion();
      //crea la cadena
      int[] nums = {5, 8, 69, 9, 33, 65, 45, 19, 43, 62, 71};
      //lamamos el método que ordena
      int[] insertion = insertion.Insercion(nums);
      //recorremos el array
      for (int i = 0; i < ordenarInsercion.length; i++) {
          //Imprimimos la cadena
          System.out.println(ordenarInsercion[i]);
      }
  }
   public int[] ordenarInsercion(int[] array) {
        int aux; //Se crea un variable para usar temporalmente
        //Utilizamos un for para rcorrer el tamaño de la matriz
        for (int i = 1; i < array.length; i++) {
            //la variable temporal toma el valor
            aux = array[i];
            //recorremos con otro for para ubicar si el temporal es mayor que los otrs números
            for (int j = i - 1; j >= 0 && array[j] > aux; j--) {
                array[j + 1] = array[j];
                //cambia el valor del temporal por el que se esta recorriendo
                array[j] = aux;
            }
        }
        //retorna el array
        return array;
    }
}
