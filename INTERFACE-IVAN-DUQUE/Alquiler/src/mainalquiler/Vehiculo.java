/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

import java.util.ArrayList;

/**
 *
 * @author ivandavid
 */
public class Vehiculo {
    private String vehiculoNom;
    private String placa; 
    private int kilometraje;
    private ArrayList<Cliente> clienteList;

    public ArrayList<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(ArrayList<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Vehiculo(String vehiculoNom, String placa, int kilometraje) {
        this.vehiculoNom = vehiculoNom;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.clienteList=new ArrayList<>();
    }
    public void añadirCliente(Cliente cliente){
        clienteList.add(cliente);
    }
    public void mostrarCliente(){
        for (Cliente client : clienteList) {
            System.out.println(client);
        }
    }
    public String getVehiculoNom() {
        return vehiculoNom;
    }

    public void setVehiculoNom(String vehiculoNom) {
        this.vehiculoNom = vehiculoNom;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "" + "vehiculo:" + vehiculoNom + ", placa=" + placa + ", kilometraje=" + kilometraje + "," + clienteList;
    }
    
    
    
}
