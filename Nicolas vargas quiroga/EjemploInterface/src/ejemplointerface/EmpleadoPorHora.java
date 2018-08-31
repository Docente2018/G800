/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerface;

/**
 * 
 */
public class EmpleadoPorHora extends Empleado
{
    private int cantidadHorasTrabajadas;
    private double valorHora;

    public EmpleadoPorHora() 
    {        
        cantidadHorasTrabajadas =0;
        valorHora =0;
    }
    
    
    
    public EmpleadoPorHora(int cantidadHorasTrabajadas, double valorHora,String CEDULA, String nombreCompleto )
    {      
        super(CEDULA, nombreCompleto);
        this.cantidadHorasTrabajadas= cantidadHorasTrabajadas;
        this.valorHora= valorHora;
    }
    public int getCantidadHorasTrabajadas() 
    {
        return cantidadHorasTrabajadas;
    }

    public double getValorHora()
    {
        return valorHora;
    }

    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas)
    {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }
        
    public void setValorHora(double valorHora)
    {
        this.valorHora = valorHora;
    }
        
    @Override
    public String imprimirInformacion()
    {
      calcularSalario();
     return  "\nCantidad Horas trabajadas " + cantidadHorasTrabajadas 
             + "\nValor Hora trabajada: " + valorHora 
             + "\nEl Sueldo: "+ calcularSalario();
    }
    @Override
     public double calcularSalario()
     {
         double sueldoTotal;
         sueldoTotal = cantidadHorasTrabajadas * valorHora;         
         
         return sueldoTotal;
     }
     
}

    
