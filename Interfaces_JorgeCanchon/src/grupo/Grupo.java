/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo;

import cantante.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Grupo extends Persona implements Crud { 
    private List<Persona> persona = new ArrayList<Persona>();
    public Grupo(String Nombre, String Apellido, int Edad, String trabajo) {
        super(Nombre, Apellido, Edad, trabajo);
    }
    @Override
    public String Delete(int index) {
        String res = "";
        if(IsExistID(index)){
            persona.remove(index);
            res = "Se elimino el cliente con id:"+ index;
        }else{
            res = "El id ingresado no existe";
        }
        return res;
    }

    @Override
    public String Update(int index, String Nombre, String Apellido, int Edad, String trabajo) {
        String res = "";
        try{
            Persona person = new Persona(Nombre, Apellido, Edad,trabajo); 
            persona.set(index, person);
            res = "Se actualizo correctamente el cliente " + Nombre;
        }catch(Exception e){
            res = "Ocurrio un error en la actualización del cliente " + Nombre;
        }
        return res;
    }

    @Override
    public String Add(String Nombre, String Apellido, int Edad, String trabajo) {
        String res = "";
        try{
            Persona p = new Persona(Nombre,Apellido,Edad,trabajo);
            persona.add(p);
            res = "Se agrego el cliente con exito";
        }catch(Exception e){
            res = "Hubo un error insertando el cliente";
        }
        return res;
    }

    @Override
    public String ListAll() {
        String res = "";
        if(persona.isEmpty()){
            res = "No hay clientes para listar";
        }else{
            for (int i = 0; i < persona.size(); i++) {
                res += "Id: " + i + " " + persona.get(i).getNombre() + " " + persona.get(i).getApellido() + " " + persona.get(i).getEdad() + " " + persona.get(i).getTrabajo() + "\n";
            }
        }
        return res;
    }
    public boolean IsExistID(int id){
        boolean res = false;
        try{
            persona.get(id);
            return true;
        }catch(Exception e){ res = false;}
        return res;
    }
    public Persona GetPerson(int index){
        return persona.get(index);
    }
}
