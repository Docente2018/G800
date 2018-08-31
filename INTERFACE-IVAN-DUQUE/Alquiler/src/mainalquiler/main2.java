/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

import java.util.Random;

/**
 *
 * @author ivandavid
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alquiler alquila= new Alquiler();
       
       Random k = new Random();
       
        for (int i = 0; i < 10; i++) {
            Vehiculo vh= new Vehiculo("Moto"+i, "ADP00"+i, k.nextInt(200));
            vh.getClienteList().add(new Cliente ("Cliente"+i,105454+i));
            alquila.añadirVehiculo(vh);
        }
 
   
       
       alquila.mostrarVehiculo();
    }
    
}
