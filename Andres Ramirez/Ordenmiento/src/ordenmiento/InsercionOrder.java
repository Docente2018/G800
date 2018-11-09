/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenmiento;

/**
 *
 * @author ESTUDIANTE
 */
public class InsercionOrder {
        
    public static void main(String[] args) {
        InsercionOrder orden = new InsercionOrder();
        int[] nums = {1,4,9,59,23,26,20,1,23,56,7};
        int[] ordenarInsercion = orden.ordenarInsercion(nums);
        for (int i = 0; i < ordenarInsercion.length; i++) {
            System.out.println(ordenarInsercion[i]);            
        }
    }
    public int[] ordenarInsercion(int[] array){
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
        return array;
    }
}
