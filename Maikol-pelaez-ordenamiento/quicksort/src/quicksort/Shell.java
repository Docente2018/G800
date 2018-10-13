/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author maikol
 */

//se extiende de la clase molde para heredar todas sus caracteristicas.
public class Shell extends Molde {

    public Shell(int numero, String nombre) {
        //metodo contructor de la clase padre Molde,
        super(numero, nombre);
    }

    public int[] ordenar(int[] array) {

        int salto, aux, i;
        boolean principal;
        for (salto = array.length / 2; salto != 0; salto /= 2) {
            principal = true; // se inicializa la variable principal para que dentre al while
            
            // se ejecuta el algoritmo cuando se intercambie algun elemento.
            while (principal) { 
                /*cuando dentre al while se cambia el estado a false para que 
                cuando dentre al if se pueda pueda evaluar algun cambio.
                
                */
                
                principal = false;
                
                //se inicializa el for con la variable salto que es el prom /2
                for (i = salto; i < array.length; i++) 
                {
                    //se valida si estan desonrdenaos para organizar.
                    if (array[i - salto] > array[i]) { 
                        aux = array[i]; 
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        
                        //se cambia el estado a true para entrar en el ciclo para evaluar.
                        principal = true; 
                    }
                }
            }
        }
        
        //se retorna el array ordenado
        return array;
    }

}
