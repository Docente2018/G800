/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ESTUDIANTE
 */

public class encapsularClase {
    
    //Encapsulación 
    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
       
}
 class Numeros{
     public static void main(String[] args) {
         encapsularClase br = new encapsularClase();
         br.setNum1(10);
         System.out.println("Cualquier cosa" + br.getNum1());
     }
    }
