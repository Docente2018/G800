package quicksort;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*se definen variables para el menu y tamaño del arreglo capturado por 
            el usuario
         */
        int numerMenu = 0, tamano = 0;
        int[] array;

        //se define do while para repetir la solictud se se genera una exepcion
        do {

            //try catch para capturar la excepciones numericas
            try {

                // se crea el obj Scanner para capturar los valores por el usuario
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa el numero dependiendo el ordenamiento");
                System.out.println("1 ordenamiento quicsort \n"
                        + "2 ordenamiento peine \n"
                        + "3 ordenamiento shell \n");
                //se captura valor por el usuario para seleccionar metodo de ordenacion
                numerMenu = Integer.parseInt(sc.nextLine());
                System.out.println("Ingresa el tamaño del Array");
                //se captura el tamaño definido para el array 
                tamano = Integer.parseInt(sc.nextLine());

                //switch case para ejecutar metodo de ordenacion
                switch (numerMenu) {
                    case 1:

                        /*
                        se instancia el objQuicksort para ejecutar los metodos de dicha clase
                        con el metodo Quicksort
                         */
                        Quicksort objQuicksort = new Quicksort(tamano, "******** Metodo Quicksort ***** \n");

                        //imprime el nombre definido en el constructor.
                        System.out.println(objQuicksort.getNombre());

                        /*se genera los numeros aleatorios y se almacenan en el array
                         ---> objQuicksort.numeroAleatorio()
                        
                        ----> objQuicksort.imprimir(array); se imprime el array
                        desordenado
                         */
                        System.out.println("Array a ordenar ---->");
                        array = objQuicksort.numeroAleatorio();
                        objQuicksort.imprimir(array);
                        /*
                        se llama el metodo ordenar y se inserta el array desordenado
                         */
                        System.out.println("Array  ordenado ---->");
                        objQuicksort.ordenar(0, array.length - 1, array);
                        //se imprime el array ordenado
                        objQuicksort.imprimir(objQuicksort.getArray());

                        break;
                    case 2:
                        /*
                        se instancia el objPeine para ejecutar los metodos de dicha clase
                        con el metodo peine
                         */
                        Peine objPeine = new Peine(tamano, "******** Metodo peine *****");
                        //imprime el nombre definido en el constructor.
                        System.out.println(objPeine.getNombre());
                        /*se genera los numeros aleatorios y se almacenan en el array
                         ---> objPeine.numeroAleatorio()
                        
                        ----> objPeine.imprimir(array); se imprime el array
                        desordenado
                         */
                        System.out.println("Array a ordenar ---->");
                        array = objPeine.numeroAleatorio();
                        objPeine.imprimir(array);
                        /*
                        se llama el metodo ordenar y se inserta el array desordenado
                         */
                        System.out.println("Array  ordenado ---->");
                        objPeine.ordenar(array);
                        //se imprime el array ordenado
                        objPeine.imprimir(objPeine.getArray());
                        break;
                    case 3:
                        /*
                        se instancia el objShell para ejecutar los metodos de dicha clase
                        con el metodo Shell
                         */
                        Shell objShell = new Shell(tamano, "******** Metodo Shell *****");
                        //imprime el nombre definido en el constructor.
                        System.out.println(objShell.getNombre());

                        System.out.println("Array a ordenar ---->");
                        array = objShell.numeroAleatorio();
                        objShell.imprimir(array);
                        /*
                        se llama el metodo ordenar y se inserta el array desordenado
                         */
                        System.out.println("Array  ordenado ---->");
                        objShell.ordenar(array);
                        //se imprime el array ordenado
                        objShell.imprimir(objShell.getArray());

                        break;
                    default:

                        System.out.println("Hey marcaste un numero no permitido");
                        break;
                }
            } catch (Exception e) {

                System.out.println("Solo se permite numeros Intentalo nuevamente");
            }

            //se repide el do while si no cumple con la condicion.
        } while (numerMenu <= 0 || numerMenu >= 4  );
    }

}
