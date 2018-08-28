/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantante;

import grupo.Grupo;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int res = Integer.parseInt(JOptionPane.showInputDialog("Menú: \n 1.Persona\n 2.Grupo Personas\n3.Salir"));
            switch(res){
                case 1:
                    Persona persona = new Persona("Julia", "Gonzalez", 25, "Desarrollo de moviles");
                    HacerCantar(persona);
                    persona.Trabajar();
                    Canario canario = new Canario();
                    HacerCantar(canario);
                    break;
                case 2:
                    Grupo grupo = new Grupo("Marlen", "Espinosa", 20, "Desarrollo web");
                    int respuesta = 1;
                    do{
                        try{
                            int caso = Integer.parseInt(JOptionPane.showInputDialog("Menù \n1.Crear cliente\n2.Actualizar cliente\n3.Eliminar cliente\n4.Listar cliente\n5.Salir"));
                            int index = -1;
                            String Nombre = "";
                            String Apellido = "";
                            int Edad = -1;
                            String trabajo = "";
                            switch(caso){
                                case 1:
                                    Nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                                    Apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente.");  
                                    Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente"));
                                    trabajo = JOptionPane.showInputDialog("Oficio del cliente");
                                    JOptionPane.showMessageDialog(null, grupo.Add(Nombre, Apellido, Edad, trabajo));
                                    break;
                                case 2:
                                    index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id cliente a modificar")); 
                                    if(grupo.IsExistID(index)){
                                        Persona person = grupo.GetPerson(index);
                                        Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", null, JOptionPane.QUESTION_MESSAGE,null,null, person.getNombre()).toString();
                                        Apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente.", null, JOptionPane.QUESTION_MESSAGE,null,null,person.getApellido()).toString();
                                        Edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del cliente.", null, JOptionPane.QUESTION_MESSAGE,null,null, person.getEdad()).toString());
                                        trabajo = JOptionPane.showInputDialog(null, "Oficio del cliente.", null, JOptionPane.QUESTION_MESSAGE,null,null,person.getTrabajo()).toString();
                                        JOptionPane.showMessageDialog(null, grupo.Update(index, Nombre, Apellido, Edad, trabajo));
                                    }else{
                                        JOptionPane.showMessageDialog(null,"El id ingresado no existe");
                                    }
                                    break;
                                case 3:
                                    index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del cliente a eliminar"));
                                    JOptionPane.showMessageDialog(null,grupo.Delete(index));
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null,grupo.ListAll());
                                    break;
                                case 5:
                                    respuesta = 0;
                                    break;
                                default:
                                        JOptionPane.showMessageDialog(null,"Valor ingresado no vàlido");
                                    break;
                                    
                            }
                        }catch(Exception e){
                            respuesta = 0;
                            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
                        }
                        try{
                            if(respuesta != 0)
                                respuesta = Integer.parseInt(JOptionPane.showInputDialog("Menù \n ¿Desea continuar? \n1.SI\n 2.NO"));
                        }catch(Exception e){
                            respuesta = 0;
                            JOptionPane.showMessageDialog(null,"Error: "+ e.getMessage());
                        }
                        
                    }while(respuesta == 1);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Item no válido");
                    break;
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    public static void HacerCantar(Cantante c){
        c.cantar();
    }
}
