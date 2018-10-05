/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        // TODO code application logic here
        int n1 = 0;
        int n2 = 1;
        int aux;
        String str ="";
        //el limite nos indica cuantos numeros se van a imprimir
        int limite ;
        
        try {
            
    
        // pide al usuario la cantidad de numeros a imprimir
        System.out.println("cuantos numeros desea generar");
        //lee el valor ingresado
        limite=leer.nextInt();
                       
    
                
        System.out.println("los " + limite + " numeros son:" );
         
           
        for (int n = 1; n <= limite; n++){
            aux=n1;
            n1=n2+aux;
            n2=aux;
           
       System.out.println(n2);
        }
        
        }catch(NumberFormatException ex){
        	System.out.println("No es un número");

	// Instrucciones cuando se produce una excepcion
        }
        }
        
    }

    

    

    
