/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenmiento;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Ordenmiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);
        System.out.println(numbers); //[6, 2, 1, 4, 9]
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers); //[1, 2, 4, 6, 9]
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
        
    }

}
