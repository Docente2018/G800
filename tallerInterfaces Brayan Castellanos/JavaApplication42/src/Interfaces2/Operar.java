/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces2;

/**
 *
 * @author Brayan Castellanos
 */
public class Operar implements Calcular {

    @Override
    public void calcularNum(int num1, int num2) {      
    if(num1 > num2){
        System.out.println("el numero "+num1+ " es mayor que"+num2);
    }else{
        System.out.println("el numero "+num2+ " es mayor que"+num1);
   }
      if(num1 % 2 == 0){     
          System.out.println("el numero "+num1+" es par ");
      }else{         
          System.out.println("el numero "+num1+" es impar ");
      }
      if(num2 % 2 == 0){         
          System.out.println("el numero "+num2+" es par ");
      }else{         
          System.out.println("el numero "+num2+" es impar ");
      }
    
    }
    
}
