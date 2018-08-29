
package interfaces;

/**
 *
 * @author maikol
 */
public class Producto {
    
    
    private String Nombre;
    private int precio;
    private int cantidad;

    public Producto(String Nombre, int precio, int cantidad) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
