/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces2;

import java.util.Scanner;

/**
 *
 * @author Brayan Castellanos
 */
public class InterfazMain {
     public static void main(String[] args) {   
        Operar ope = new Operar();
        Scanner a = new Scanner(System.in);
        System.out.println("Este programa le ayuda a calcular  el numero mayor y si es par, digite el primer numero:");
        int num1 = a.nextInt();
        System.out.println("digite el siguiente numero");
        int num2 = a.nextInt();
    ope.calcularNum(num1, num2);
    }

}
