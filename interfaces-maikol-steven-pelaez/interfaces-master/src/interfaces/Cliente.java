package interfaces;

/**
 *
 * @author maikol
 */
public class Cliente extends Persona {

    private String direccion;
    private int puntos;

    public Cliente(String direccion, int puntos, String nombre, String apellido, long telefono) {
        super(nombre, apellido, telefono);
        this.direccion = direccion;
        this.puntos = puntos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
