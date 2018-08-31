/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainalquiler;

/**
 *
 * @author Santi Duque
 */
public interface Usuario {
    
    public void ingresar(String usu, String clave);    
    public void recordarClave();   
    public void recordarUsuario();
}
