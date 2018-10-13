package quicksort;

import java.util.Random;
//clase molde que heredan la clases hijas 

public abstract class Molde {

    //se define variables que heredaran sus hijas para su ordenacion
    private int numero;
    private int array[];

    private String nombre;

    //constructor para inicializar todas la variables
    public Molde(int numero, String nombre) {
        this.numero = numero;
        this.array = new int[this.numero];
        this.nombre = nombre;
    }

    //metodos get y set para las variables.definidas en su cabecera.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo que nos generara los numeros aleatorios 
    public int[] numeroAleatorio() {

        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            this.array[i] = aleatorio.nextInt(this.numero);
        }

        return array;

    }

    //imprime el array ordenado y desordenado.
    public void imprimir(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ,");
        }
        System.out.println("\n");
    }
}
