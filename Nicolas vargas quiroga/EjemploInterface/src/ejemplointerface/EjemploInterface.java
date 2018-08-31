/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

import javax.swing.JOptionPane;
import java.util.Vector;

/**
 *
 * @author Nicolas Vargas
 */
public class EjemploInterface
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String cedula;
        String nombreCompleto;
        int horasTrabajadas, selector=1;
        double valorHora;
        int ventasTotales;
                
        Vector vectorE= new Vector();
        
        try {
            do 
        {      
           selector = Integer.parseInt(JOptionPane.showInputDialog("Digite [1] si quiere ingresar los datos del empleado, [0] para salir")) ;
           
            switch(selector)
            {                
                case 1:
                  
        nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo");    
        
        cedula = JOptionPane.showInputDialog("Ingrese la cedula del empleado");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor por hora trabajada"));
        
        EmpleadoPorHora EH1 = new EmpleadoPorHora(horasTrabajadas, valorHora, cedula, nombreCompleto);
       
        vectorE.addElement(EH1);
        JOptionPane.showMessageDialog(null, EH1.imprimirInformacion()+ "" +EH1.toString());        
                    
                    break;                                    
            }            
        } while (selector !=0);
           JOptionPane.showMessageDialog(null, "Hasta luego viejo!!");        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
      
    }
    
}
