/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;


    class Animal {

        public void nacer() { // Metodo 
            System.out.println("Ha nacido un animal");
        }
    }

    class Rugir extends Animal {

        public void rugir() { // Metodo 
            System.out.println("Hace algun ruido");
        }
    }
public class Animales{
    public static void main(String[] args) {
        System.out.println("A coninuacion se ve el proceso del animal");
        Rugir r = new Rugir();
        r.nacer();
        r.rugir();
    }
   
}




