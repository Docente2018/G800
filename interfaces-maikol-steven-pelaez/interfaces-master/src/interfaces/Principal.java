/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author maikol
 */
public class Principal {

  
    public static ArrayList<Producto> producto=new ArrayList<Producto>();
    
    public static void main(String[] args) {
        
        Producto pro1=new Producto("Queso", 1000, 2);
        Producto pro2=new Producto("papa", 2000, 1);
        Producto pro3=new Producto("chorizo", 2500, 3);
        
        producto.add(pro1);
        producto.add(pro2);
        producto.add(pro3);
        
        Cliente cli1=new Cliente("call 21", 1, "pepito", "perez", 320147445);
        Empleado emp1=new Empleado("marta", "perlaza", 320154112, 300000, 0);
        
        Venta v1=new Venta(cli1, emp1, producto);
        
        v1.registrarVenta(v1);
        
        System.out.println(v1.calcularVenta());
        System.out.println("\n");
        System.out.println("Nombre del vendedor "+v1.getEmpleado().getNombre());
        System.out.println("\n");
        System.out.println( "total venta con descuento"+v1.descuento(new ventaCatalogo()));
        
        
        
    }
    
    
    
}
