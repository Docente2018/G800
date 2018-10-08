/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoi;

import java.util.Scanner;

/**
 *
 * @author Lucia
 */
public class TorreHanoi {
    
    public static void main(String[] args) {
        
         for ( int factor = 1; factor <= 3; factor ++ ) {
                  try {     
        System.out.println("Numero:\n");
        int nDisks = 0;
        // Escanner 
        Scanner sc = new Scanner(System.in);
        nDisks = sc.nextInt();
        // Se define el disco
        
        //Metodo recursivo.
        doTowers(nDisks, 'A', 'B', 'C');
         } catch (Exception excepcion) {
          System.out.println("No se puede ingresar texto:"); 

            }
         }
                  
    }

     public static void doTowers(int topN, char from,
    char inter, char to) {
        if (topN == 1){
            System.out.println("Disco 1 de " + from + " a " + to);
        }else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
            // llamada recursiva
            doTowers(topN - 1, inter, from, to);
        }
    }
}
