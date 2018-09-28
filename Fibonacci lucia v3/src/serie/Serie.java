/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;
import jdk.nashorn.internal.ir.CatchNode;
import java.util.InputMismatchException;
/**
 *
 * @author LUCIA
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        for ( int factor = 1; factor <= 3; factor ++ ) {
      
            
           try {     
    Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        
           
        do{
           
            System.out.print("Ingrese un número mayor que 1: ");
            numero = sc.nextInt();       
                  
        }
         
        while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    
     } catch (Exception excepcion) {
          System.out.println("No se puede ingresar texto:"); 

            }
    }
    
    }
}


