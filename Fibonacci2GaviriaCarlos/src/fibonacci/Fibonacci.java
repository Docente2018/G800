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
        
        Scanner s = new Scanner(System.in);//ingreso de variable por teclado
        
        int digito = 0,i,ii = 0,fib1,fib2,intentos =0;// variables
        
         
        
        //for(intentos=2;intentos <3;intentos++){
           // System.out.println("Prueba nuevamente");
           /*            // }
           do{
           intentos++;
           }
           while(intentos <3);*/
        try {
            
       

            do{
            System.out.println("Introduce un Numero mayor a 1");
            digito = s.nextInt();
            intentos ++;
            
            }
            while(digito <= 0+ii && intentos <3);
            if(digito > 1){
                System.out.println("Fibonacci de: " +digito+"");
                
            }
            else{
                System.out.println("Intentos hechos: "+intentos+"");
            }
            
            

       

        

        } 
        catch (Exception e) {
            System.out.println("No se ingreso un valor valido");
        }

        
        fib1=1;
        fib2=1;
        
        //System.out.println(fib1+" "); 
        
        for(i=2;i <=digito;i++){
            if(i < 31){
           
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
            System.out.println(fib2+" ");

            }
                   
        }
  
        System.out.println();
        
    }
    
    
    
}
