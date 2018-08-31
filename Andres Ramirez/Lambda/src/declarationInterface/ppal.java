/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declarationInterface;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andres
 */
public class ppal {
    
    
    public static void main(String[] args) {
        
        //variables
        
        Testlambda testlambda = new Testlambda();
        System.out.println("--> "+testlambda.suma(5, 7));
        
        //----------
        secondImplement var = new secondImplement();
        System.out.println("--->" + var.suma(10, 8));
        
        //----------
        //Se crea una o mas variables segun lo requera.
        Testlambda pares = new Testlambda();
        //Se crea una lista con una¿os valores por defecto.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
        //Se imprime lo pasa en la clase que esta implementando la interfaz
        System.out.println("---> " + pares.numerosPares(listaNumeros));
          testlambda.numerosPares(listaNumeros).forEach((valor) -> {
            System.out.println("Numeros pares " + valor);});
        
        
        
        secondImplement impares = new secondImplement();
        //Se crea una lista con una¿os valores por defecto.
        List<Integer> listaNumerosImp = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
        //Se imprime lo pasa en la clase que esta implementando la interfaz
        System.out.println("---> " + impares.numerosImpPares(listaNumerosImp));
        impares.numerosImpPares(listaNumerosImp).forEach((valor) -> {
            System.out.println("Numeros impares  " + valor);});
        
        
    }
}
