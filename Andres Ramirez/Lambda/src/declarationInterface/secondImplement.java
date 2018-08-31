/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declarationInterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class secondImplement implements Interface {

    public secondImplement() {
    }

    @Override
    public int suma(int a, int b) {
        return (a + b) + a;
    }

    @Override
    public List <Integer> numerosPares(List<Integer> listaNumeros) {
        return null;   
    }
    @Override
    public List<Integer> numerosImpPares(List<Integer> listaNumerosImp) {
        List<Integer> numeroImpares = new ArrayList<>();
        for (int i = 0; i < listaNumerosImp.size(); i++) {
            if (listaNumerosImp.get(i) % 2 == 1) {
                numeroImpares.add(listaNumerosImp.get(i));
            }
        }
     
        return numeroImpares;
    }

   



   

}
