/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class ArrayReales implements Estadisticas{

    double [] valor;
    @Override
    public double minimo() {
        double menor = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if(menor > valor[i]) {
                menor = valor[i];
            }
        }        
        return menor;
    }

    @Override
    public double maximo() {
        double mayor = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if(mayor<valor[i]){
                mayor = valor[i];
            }
        }
        return mayor;
    }

    @Override
    public double sumatorio() {
        double suma = 0.0;
        for (int i = 0; i < valor.length; i++) {
            suma +=valor[i];
        }
        return suma;
    }
}
