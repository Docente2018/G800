/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

/**
 *
 * @author Nicolas Vargas
 */
public abstract class Empleado implements PersonaAsalariada
{
    public final String CEDULA;
    public final String nombreCompleto;
    
    public Empleado()
    {
        nombreCompleto= "";
        CEDULA = "";        
    }
    
    public Empleado( String CEDULA, String nombreCompleto)
    {        
        this.CEDULA= CEDULA;
        this.nombreCompleto = nombreCompleto;
    
    } 
    
    public String getNombre()
    {
        return  nombreCompleto;
    }
     public String getCedula()
    {
        return  CEDULA;
    }

    @Override
    public String toString() 
    {
        return  "\ncedula = " + CEDULA + "\nnombre Completo = " + nombreCompleto ;
    }
    

}
