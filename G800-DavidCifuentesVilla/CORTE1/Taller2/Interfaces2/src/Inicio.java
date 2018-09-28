/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Inicio {
    static Vehiculo[] moviles;
    public static void main(String[] args) {
        Vehiculo v1 = new Moto();
        Vehiculo v2 = new Coche();
        System.out.println(v1.Acelerar(100));
        System.out.println(v1.Frenar(25));
        System.out.println(v2.Acelerar(200));
        System.out.println(v2.Frenar(30));
        
        int cantidad = (int) (Math.random() * 10) + 1;
        moviles = new Vehiculo[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            int tipoCoche = (int) (Math.random() * 2);
            int valorA = (int) (Math.random() * 200);
            int valorF = (int) (Math.random() * 200);
            System.out.println(" -------- Vamos a crear un vehiculo tipo "+tipoCoche);
            if(tipoCoche == 1){
                moviles[i]=new Coche();
            }
            else{
                moviles[i]=new Moto();
            }
            System.out.println(moviles[i].Acelerar(valorA));
            System.out.println(moviles[i].Frenar(valorF));
        }
    }
}
