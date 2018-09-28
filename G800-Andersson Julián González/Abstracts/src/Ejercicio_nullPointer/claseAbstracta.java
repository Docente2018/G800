/*
°°Andersson González
 */
package Ejercicio_nullPointer;

/**
 */
public class claseAbstracta {

    public static void main(String[] args) {

        Grupo[] DirectivosColegio = new Grupo[4];
   
        DirectivosColegio[0] = new Profesores("Profesores");
        DirectivosColegio[1] = new Directores("Directores");
        DirectivosColegio[2] = new Padres("Padres");
        DirectivosColegio[3] = new Estudiantes("Estudiantes");

        for (Grupo e : DirectivosColegio) {

            System.out.println(e.GrupoDirectivo());
        }
    }
}

abstract class Grupo {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String GrupoDirectivo();

}

class Profesores extends Grupo {

    public Profesores(String name) {
        super.setName(name);
    }

    public String GrupoDirectivo() {
        return "En el colegio están: " + super.getName();
    }
}

class Directores extends Grupo {

    public Directores(String name) {
        super.setName(name);
    }

    public String GrupoDirectivo() {
        return "En el colegio están: " + super.getName();
    }
}

class Padres extends Grupo {

    public Padres(String name) {
        super.setName(name);
    }


    public String GrupoDirectivo() {
        return "En el colegio están:  " + super.getName();
    }

}

class Estudiantes extends Grupo {

    public Estudiantes(String name) {
        super.setName(name);
    }

    public String GrupoDirectivo() {
        return "En el colegio están: " + super.getName();
    }
}
