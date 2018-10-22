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
public class Short {
    public static void shellSort(int[] matrix) {
    for ( int increment = matrix.length / 2;increment > 0;
          increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
        for (int i = increment; i < matrix.length; i++) {
            for (int j = i; j >= increment && matrix[j - increment] > matrix[j]; j -= increment) {
                int temp = matrix[j];
                matrix[j] = matrix[j - increment];
                matrix[j - increment] = temp;
            }
        }
    }
}
}
