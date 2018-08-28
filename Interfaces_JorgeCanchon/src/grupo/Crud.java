/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo;

import cantante.Persona;

/**
 *
 * @author ESTUDIANTE
 */
public interface Crud {
    public String Delete(int index);
    public String Update(int index, String Nombre, String Apellido, int Edad, String trabajo);
    public String Add(String Nombre, String Apellido, int Edad, String trabajo);
    public String ListAll();
}
