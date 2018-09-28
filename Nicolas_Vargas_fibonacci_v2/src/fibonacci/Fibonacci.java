/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Nicolas Vargas
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);                  
         /*Se declaran las variables*/
        int fibo1,fibo2,i, select,selectNumber, contador = 0;
        String selector, number;                
                                        
        try {
                        
            boolean flag = true;
                        
            while (flag == true){                
                System.out.print("Digite [1] si quiere ingresar la serie de fibonacci, [0] para salir\n");                
                selector = sc.nextLine();
                select = ValidarNumero(selector);
                
                if (select == 1){
                    if(Integer.parseInt(selector) == 1){
                      
                   System.out.print("-----Bienvenido a fibonacci----\n");
                         //Introduce el rango de fibonacci
                         System.out.print("Introduce un numero mayor que 1: ");
                         number = sc.nextLine();
                         selectNumber = ValidarNumero(number);
                         
                         if (selectNumber == 1){
                             if(Integer.parseInt(number) > 1){
                                 System.out.println("Los " + number + " primeros términos de la serie de Fibonacci son:"); 

                                fibo1=1;
                                fibo2=1; 
                                //Imprime el primer termino de la serie

                                System.out.print(fibo1 + " ");
                                //Hace un ciclo para buscar los numeros en el rango dado.
                                for(i=2;i<=Integer.parseInt(number);i++){
                                    //*Imprime todos los numeros de la serie en el rango establecido
                                    System.out.print(fibo2 + " ");
                                    fibo2 = fibo1 + fibo2;
                                fibo1 = fibo2 - fibo1;                                
                                } 
                             }                                
                         }
                         else{
                             System.out.print("\nuno: "+contador);
                             contador++;
                                System.out.print("lea bien\n");
                                if(contador == 3){
                                    System.out.print("Excede el numero de errores.\n");
                                    flag = false;
                                }
                             
                         }
                                                                              
                    }
                    if(Integer.parseInt(selector) == 0){
                        System.out.print("\ndos: "+contador);
                        contador++;
                        System.out.print("Hasta luego.\n");
                      flag = false;
                    }
                   // else{
                     //   System.out.print("\ntres: "+contador);
                       // contador++;
                        //System.out.print("Solo 1 o 0.\n");
                        //if(contador == 3){
                         //   System.out.print("Excede el numero de errores.\n");
                         //   flag = false;
                  //}
                    //}                        
                }
                else{
                  contador++;
                  if(contador == 3){
                      System.out.print("Excede el numero de errores.\n");
                      flag = false;
                  }
                }                
                
                /*if(Integer.parseInt(selector) != 0){
                    select = ValidarNumero(selector);
                    System.out.print(select);
                    System.out.print(select);
                }else{
                    flag = false;
                    break;
                }*/
            }                
            
            //} while (Integer.parseInt(selector) !=0 || contador ==3);
        } catch (Exception e) {
        }   
        
    }
    
    public static int ValidarNumero(String numero){       
        try {
         Integer.parseInt(numero);   
         return 1;
        } catch (Exception e) {
            return 2;
        }                
    }
    
}
