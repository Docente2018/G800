/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.lang.reflect.Array;
import java.util.List;
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
     int a=1;
     int b=1;
     int c=1;
        int s=0;
        int contador=0;
        Scanner scan=new Scanner(System.in);
        int i=0;
        boolean d=true;
        while(d){
        System.out.println("Ingrese numero de ciclos de la serie fibonnacy");
        String var=scan.next();
        System.out.println("--------------------------------------------");
        try{
       
        while ((Integer.parseInt(var))>i-1){
        if(i==0){
          i=+1;
             System.out.println(i+")"+0);
          i=+2;
        System.out.println(i+")"+a);
        i=3;
        System.out.println(i+")"+a);
        i=4;
         }
        b=a+c;
        System.out.println(i+")"+b);
        c=a;
        a=b;
        i++;
        }
       
        }catch(Exception e){
            System.out.println("Caracter no valido");
            contador++;
        }
        if(contador>2 || i>0){
        d=false;
        }
        }
      
    }
    
}
