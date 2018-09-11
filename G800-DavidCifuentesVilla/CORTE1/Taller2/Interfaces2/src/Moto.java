/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Moto implements Vehiculo{
    
    int velocidad;

    @Override
    public String Frenar(int valor) {
        velocidad-=valor;
        return "La moto a frenado ahora va a " + velocidad + "Kilometros por hora";    
    }

    @Override
    public String Acelerar(int valor) {
        String cadena="";
        velocidad+=valor;
        if(velocidad>velocidad_Maxima){
            cadena = "Exceso de Velocidad, el vehiculo va a "+velocidad+" kilometros por hora";
        }
        else{
            cadena += "La moto a acelerado ahora va a " + velocidad + "Kilometros por hora";
        }
        return cadena;    
    }
    
}
