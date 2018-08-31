/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

import java.util.Scanner;

public class MainAlquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenidos al Alquiler de Vehiculo\n");
        String usu="";
        String clave="";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Para ingresar digite su usuario:\n");
        usu=leer.nextLine();
        
       System.out.println("Para ingresar digite su clave:\n");
       clave=leer.nextLine();
        Cliente cli = new Cliente(usu,1234);
        cli.ingresar(usu, clave);
        
        Alquiler alquila= new Alquiler();
       Vehiculo vh= new Vehiculo("moto", "AD123", 120);
       vh.getClienteList().add(new Cliente ("Ivan",1054549));
       
       Vehiculo vh2= new Vehiculo("carro", "san123", 320);
       vh2.getClienteList().add(new Cliente ("jan",1052548));
       
       
       alquila.añadirVehiculo(vh);
//       vh.mostrarCliente();
      
       alquila.añadirVehiculo(vh2);
//       vh2.mostrarCliente();
       
       alquila.mostrarVehiculo();
    }
    
}
