/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import edu.prueba.co.Cliente;
import edu.prueba.co.Loro;
import edu.prueba.co.Perro;
import edu.prueba.co.Tienda;

/**
 *
 * @author ESTUDIANTE
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda tienda=new Tienda("EL Paisa","Unilago");
        Cliente cliente=new Cliente("Juanito","Perez","101022510");
        cliente.setCodigoCliente("554");
        Cliente cliente2=new Cliente("Junito2","Perez2","123456");
        cliente2.setCodigoCliente("852");
        tienda.AgregarCliente(cliente);
        tienda.AgregarCliente(cliente2);
        tienda.ListarClientes();
        Loro loro=new Loro(5,"rene","Verde");
        Loro loro2=new Loro(3,"rebeca","roja");
        Perro perro=new Perro("Akita","Zeus","Blanco");
        Perro perro2=new Perro("Pastor Aleman","Tequila","Negro");
        tienda.AgregarLoro(loro);
        tienda.AgregarLoro(loro2);
        tienda.AgregarPerro(perro);
        tienda.AgregarPerro(perro2);
        tienda.ListarLoros();
        tienda.ListarPerros();
    }
    
}
