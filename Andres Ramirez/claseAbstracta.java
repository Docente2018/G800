/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_nullPointer;

/**
 *
 * @author andres
 */
public class claseAbstracta {

    public static void main(String[] args) {

        //Aquí se define una variable con clases que se heredaran. Tipo "Objetos"
        Objetos[] misObjetosCocina = new Objetos[4];

        // Se instancian las clases a utilizar
        misObjetosCocina[0] = new Ollas("Ollas");
        misObjetosCocina[1] = new Vasos("Vasos");
        misObjetosCocina[2] = new Platos("Platos");
        misObjetosCocina[3] = new Cubiertos("Cubiertos");

        for (Objetos e : misObjetosCocina) {
            // Se ejecutara la función ObjetosCosina() de la clase que haya sido instanciada.
            // Aquí se evidencia el polimorfismo
            System.out.println(e.objetosCosina());
        }
    }
}

//La siguiente sera una clase abstracta la cual puede contener uno o mas
//definiciones de metodos abstractos
abstract class Objetos {

    //Esta variable es la que almacena el nombre del objeto
    private String name;

    //En el setter es donde se va a definir el nombre del objeto
    public void setName(String name) {
        this.name = name;
    }

    //En el getter es donde se va a optener el nombre del objeto
    public String getName() {
        return this.name;
    }

    // Se debe definir una clase abstracta
    //Cuando se cree un patron de diseño, este hay que seguirlo 
    //obligatoriamente el la jerarquia completa de herencia
    public abstract String objetosCosina();

}

class Ollas extends Objetos {

    public Ollas(String name) {
        super.setName(name);
    }

    //Se crea el siguiente metodo debido a la herencia que se hace de Objetos
    //porque es una clase abstracta y se deben definir todos los metodos
    //que esta posea
    public String objetosCosina() {
        return "En la cocina hay: " + super.getName();
    }
}

class Vasos extends Objetos {

    public Vasos(String name) {
        super.setName(name);
    }

    //Se crea el siguiente metodo debido a la herencia que se hace de Objetos
    //porque es una clase abstracta y se deben definir todos los metodos
    //que esta posea
    public String objetosCosina() {
        return "En la cocina hay: " + super.getName();
    }
}

class Platos extends Objetos {

    public Platos(String name) {
        super.setName(name);
    }

    //Se crea el siguiente metodo debido a la herencia que se hace de Objetos
    //porque es una clase abstracta y se deben definir todos los metodos
    //que esta posea
    public String objetosCosina() {
        return "El la cocina hay:  " + super.getName();
    }

}

class Cubiertos extends Objetos {

    public Cubiertos(String name) {
        super.setName(name);
    }

    public String objetosCosina() {
        return "En la cosina hay: " + super.getName();
    }
}
