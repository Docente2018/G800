/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hanoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
    }


//Método Torres de Hanoi Recursivo
public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
}

