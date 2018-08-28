
package cantante;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona extends Empleado implements Cantante {
    private String Nombre;
    private String Apellido;
    private int Edad;
    public Persona(String Nombre, String Apellido, int Edad, String trabajo){
        super(trabajo);
        this.Nombre = Nombre;
        this.Apellido= Apellido;
        this.Edad = Edad;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public void cantar() {
        JOptionPane.showMessageDialog(null,"Cantoooooo lalalala \n");
    }

    @Override
    public void Trabajar() {
       JOptionPane.showMessageDialog(null,"Yo trabajo en " + this.getTrabajo() + "\n");
    }
}
