package interfaces;

import java.util.ArrayList;

/**
 *
 * @author maikol
 */
public class Venta {

    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private double totalVenta = 0;
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public Venta(Cliente cliente, Empleado empleado, ArrayList<Producto> producto) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double calcularVenta() {
        
        for (Producto producto : productos) {
            totalVenta += producto.getCantidad() * producto.getPrecio();

        }
        return totalVenta;
    }

    public void registrarVenta(Venta v) {
        ventas.add(v);

    }

    public double descuento(TipoDescuento tipoDescuento) {

       return (this.totalVenta - tipoDescuento.TipoDescuento(this));
    }

}


