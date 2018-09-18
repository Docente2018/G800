/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        do {
            int num = 0;

            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa numero:");
                num = Integer.parseInt(sc.next());

                System.out.println("---------------------------------------------------");
            } catch (Exception e) {
                System.out.println("Solo Se permite numeros");

            }
            int num1 = 1, num2 = 0;
            if (num > 0 ) {
                System.out.println(1+") "+num2);
                System.out.println(2+") "+num1);
            }
            int cont2=2;
            for (int i = 0; i < num; i++) {
                cont2++;
                num1 = num1 + num2;
                num2 = num1 - num2;
                System.out.println(cont2+") "+num1);
                
            }
            if (num > 0) {
                cont = 0;
                cont = 3;
            } else {
                cont++;
            }

        } while (cont < 3);
    }

}
