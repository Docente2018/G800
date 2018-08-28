/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.prueba.co;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Tienda {
    private String Nombre;
    private String Ubicacion;
    private List<Cliente>cliente;
    private List<Perro>perro;
    private List<Loro>loro;
    public Tienda(String Nombre, String Ubicacion) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.cliente=new ArrayList<Cliente>();
        this.perro=new ArrayList<Perro>();
        this.loro=new ArrayList<Loro>();
     }

    public Tienda(){}
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    public String AgregarCliente(Cliente cliente){
    this.cliente.add(cliente);
    return "Se agrego el nueco cliente";
    }
    
    public void ListarClientes(){
        for (Cliente cliente1 : cliente) {
            System.out.println(cliente1.Saludar());
        }
    }
    
    public String AgregarPerro(Perro perro){
    this.perro.add(perro);
    return "Se agrego el una nuevo perro";
    }
    
    public void ListarPerros(){
        for (Perro perro1 : perro) {
            System.out.println(perro1.descripcion());
        }
    }
    
    public String AgregarLoro(Loro loro){
    this.loro.add(loro);
    return "Se agrego el un nuevo loro";
    }
    
    public void ListarLoros(){
        for (Loro loro1 : loro) {
            System.out.println(loro1.descripcion()+" "+loro1.conversionLibra());
        }
    }
}
