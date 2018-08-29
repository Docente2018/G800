
package interfaces;

/**
 *
 * @author maikol
 */
public class Empleado extends Persona{
   private int Sueldo;
   private double comicion;

    public Empleado(String nombre, String apellido, long telefono,int sueldo, double comicion) {
        super(nombre, apellido, telefono);
        this.Sueldo=sueldo;
        this.comicion=comicion;
    }

    

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getComicion() {
        return comicion;
    }

    public void setComicion(double comicion) {
        this.comicion = comicion;
    }

    
   
   
   
}
