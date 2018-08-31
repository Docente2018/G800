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
public class Testlambda implements Interface {

    public Testlambda() {
    }

    @Override
    public int suma(int a, int b) {
        return (a + b);
    }

    //Aqui se crean los encabezados o los procedimientos que van a ralizar
    //y se retornan.
    @Override
    public List<Integer> numerosPares(List<Integer> listaNumeros) {
        List<Integer> numeroPares = new ArrayList<>();
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                numeroPares.add(listaNumeros.get(i));
            }
        }
     
        return numeroPares;
    }

    @Override
    public List<Integer> numerosImpPares(List<Integer> listaNumerosImp) {
        return null;
    }

}
