package ejercicio.quick_short;

import java.io.IOException;

/**
 *
 * @author NICOLAS VARGAS
 */
public class burbuja {

    public static void main(String[] args) throws IOException {
        int[] nums = {34, 25, 13, 24, 8, 1, 0};
        int aux;

        //Se crez y se recorre la matriz con el siguiente for
        for (int i = 0; i < nums.length; i++) {

            /**
             * Utilizamos un for anidado para comparar los valores contenidos en
             * la matriz
             */
            for (int j = i + 1; j < nums.length; j++) {
                /**
                 * Si i = 0 el valor es 34 al entrar al segundo for el valor j =
                 * i + 1 será en este caso j = 1…
                 */
                if (nums[j] > nums[i]) {
                    //Aqui se ordena, si j es menor que i estos intercambian sus pocisiones 
                    //En caso de que se quiera lo contrario se cmabia el signo
                  
                    aux = nums[i];
                    /**
                     *Los datos se almacenan en la variable aux para que sean reutilizados
                     */
                    nums[i] = nums[j];
                    nums[j] = aux;
                    /**
                     * En las dos líneas anteriores se
                     * intercambiar valores con el fin de ordenarlos, por último
                     * vamos a imprimir la matriz.
                     */
                }
            }
        }
        System.out.println("La matriz ordenada");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" , ");
    


        }
    }
}
