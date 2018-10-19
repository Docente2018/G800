
package ejercicio.quick_short;

/**
 *
 * @author NICOLAS VARGAS
 */
public class OrdenamientoInsercion {

    public static void main(String[] args) {
        //Se crea order utilizando el nombre de la clase para poder crearlo y especificar
        //Que pertenece a este metodo
        OrdenamientoInsercion orden = new OrdenamientoInsercion();
        //Se crea la cadena a ordenar
        int[] nums = {1, 4, 9, 59, 23, 26, 20, 1, 23, 56, 7};
        //Realizamos el ordenamiento donde llamamos los numeros a crear
        //Y lo igualamos a la insercion del orden
        int[] ordenarInsercion = orden.ordenarInsercion(nums);
        //Elaboramos un for en donde camos a recorrer la cadena o matriz
        //que se creo antriormente y lo iremos imprimiendo si cumple el tamaño
        for (int i = 0; i < ordenarInsercion.length; i++) {
            //Imprimimos la cadena a medida que se va ordenando
            System.out.println(ordenarInsercion[i]);
        }
    }

    public int[] ordenarInsercion(int[] array) {
        //Creamos una variable auxiliar
        int aux;
        //Utilizamos un for para rcorrer el tamaño de la matriza
        for (int i = 1; i < array.length; i++) {
            //Asignamos el valor al aux cuando se recorre
            aux = array[i];
            //Utilizamos el for para validar al tamaño y asignarselo a aux "Variable"
            for (int j = i - 1; j >= 0 && array[j] > aux; j--) {
                array[j + 1] = array[j];
                //lo que esta en aux se lo asignamos a array
                array[j] = aux;
            }
        }
        //retornamos la cadena como esya creada.
        return array;
    }
}

