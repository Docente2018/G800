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
public class QuickSort {
    public static void Rapido(int matrix[], int a, int b){
    matrix = new int[matrix.length];
    int buf;
    int from = a;
    int to = b;
    int pivot = matrix[(from+to)/2];
    do{
        while(matrix[from] < pivot){
            from++;
        }
        while(matrix[to] > pivot){
            to--;
        }
        if(from <= to){
            buf = matrix[from];
            matrix[from] = matrix[to];
            matrix[to] = buf;
            from++; to--;
        }
    }while(from <= to);
    if(a < to){
        Rapido(matrix, a, to);
    }
    if(from < b){
        Rapido(matrix, from, b);
    }
} 
}
