/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

/**
 *
 * @author ivandavid
 */
public class Cliente implements Usuario{
    private String nombre;
    private int cedula;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente:" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }

    @Override
    public void ingresar(String usu, String clave) {
        if (usu.contains("cliente") && clave.contains("123")) {
            System.out.println("Bienvenido cliente");    
    }else{
            System.out.println("Usuario o clave incorrectos: "+usu+" - clave: "+clave);
        }
            
}
    @Override
    public void recordarClave() {
      System.out.println("No tiene permisos para acceder comuniquese con el administrador");  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recordarUsuario() {
System.out.println("No tiene permisos para acceder comuniquese con el administrador");
    }

    
    
}
