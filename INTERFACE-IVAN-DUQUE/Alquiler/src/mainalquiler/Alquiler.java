/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

import java.util.ArrayList;

/**
 *
 * @author ivandavid
 */
public class Alquiler {
    private ArrayList<Vehiculo> vehiculo;

    public Alquiler() {
       this.vehiculo=new ArrayList<>();
        
    }

    public void añadirVehiculo(Vehiculo vh){
        vehiculo.add(vh);
    }
    public void mostrarVehiculo(){
        for (Vehiculo vehiculom : vehiculo) {
            if(vehiculom.getKilometraje() <= 200 && vehiculom.getKilometraje() >= 100 ){
               System.out.println(vehiculom);
                    }
            
        }
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "vehiculo=" + vehiculo + '}';
    }
    
    
}
