/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocorte1;

import javax.swing.JOptionPane;
import java.util.Vector;

/**
 *
 * @author Nicolas Vargas
 */
public class EjercicioCorte1
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        int base=0, baseRect=0,altura=0,alturaREC=0, selector=1, selec_tri =1, selec_cuad =1, selec_rec = 1;
        int lado1=0,lado2=0, lado3=0, ladoCuad = 0, selector_circu=0, radioCirc=0;
        
        try {
            do 
        {      
           selector = Integer.parseInt(JOptionPane.showInputDialog("AREAS Y PERIMETROS DE\n" +
" FIGURAS GEOMETRICAS: \n [1]Circulo \n [2]Triangulo \n [3]Cuadrado\n [4]Rectangulo\n [0] para salir")) ;
           
            switch(selector)
            {   case 1:
                selector_circu = Integer.parseInt(JOptionPane.showInputDialog("Circulo: \n "
                            + "[1]Calcular Area \n [2]Calcular Perimetro"));
                switch (selector_circu)
                {
                    case 1:
                        radioCirc = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite la base del circulo"));
                        Circulo objCirculo = new Circulo(radioCirc);
                        JOptionPane.showMessageDialog(null, "El area del circulo es: "+objCirculo.CalcularArea());
                    break; 
                    case 2:
                        radioCirc = Integer.parseInt(JOptionPane.showInputDialog("Calculando Perimetro \n Digite la base del circulo"));
                        Circulo objCirculo1 = new Circulo(radioCirc);
                        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: "+objCirculo1.CalcularPerimetro());
                    break;    
                }
                break;    
                case 2:
                    selec_tri = Integer.parseInt(JOptionPane.showInputDialog("TRIANGULO: \n "
                            + "[1]Calcular Area \n [2]Calcular Perimetro"));
                    switch (selec_tri)
                    {
                        case 1:
                         base = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite la base del triangulo"));
                         altura = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite la altura del triangulo"));
                         Triangulo objTriangulo = new Triangulo(base, altura, 0,0,0);
                         JOptionPane.showMessageDialog(null, "El area del triangulo es: "+objTriangulo.CalcularArea());
                        break;
                        case 2:
                         lado1 = Integer.parseInt(JOptionPane.showInputDialog("Calculando Perimetro \n Digite el lado 1 del triangulo"));   
                         lado2 = Integer.parseInt(JOptionPane.showInputDialog("Calculando Perimetro \n Digite el lado 2 del triangulo"));
                         lado3 = Integer.parseInt(JOptionPane.showInputDialog("Calculando Perimetro \n Digite el lado 3 del triangulo"));   
                         Triangulo objTrianguloperm = new Triangulo(0, 0, lado1, lado2, lado3);
                         JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+objTrianguloperm.CalcularPerimetro());
                        break;                            
                    }                          
                    
                    break;                    
                    case 3:
                        selec_cuad = Integer.parseInt(JOptionPane.showInputDialog("CUADRADO: \n "
                            + "[1]Calcular Area \n [2]Calcular Perimetro"));
                        switch (selec_cuad)
                        {
                            case 1:
                                ladoCuad = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite el lado del cuadrado"));
                                Cuadrado objCuadra = new Cuadrado(ladoCuad);
                                JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+objCuadra.CalcularArea());
                            break;
                            case 2:
                                ladoCuad = Integer.parseInt(JOptionPane.showInputDialog("Calculando Perimetro \n Digite el lado del cuadrado"));
                                Cuadrado objCuadra1 = new Cuadrado(ladoCuad);
                                JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+objCuadra1.CalcularPerimetro());
                            break;
                        }
                    break;
                    case 4:
                        selec_rec = Integer.parseInt(JOptionPane.showInputDialog("RECTANGULO: \n "
                            + "[1]Calcular Area \n [2]Calcular Perimetro"));
                        switch (selec_rec)
                        {
                            case 1:
                              baseRect = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite la base del rectangulo"));
                              alturaREC = Integer.parseInt(JOptionPane.showInputDialog("Calculando Area \n Digite la altura del rectangulo"));  
                              Rectangulo objRect = new Rectangulo(baseRect, alturaREC);
                              JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+objRect.CalcularArea());
                            break;
                            case 2:
                              baseRect = Integer.parseInt(JOptionPane.showInputDialog("Calculando perimetro \n Digite la base del rectangulo"));
                              alturaREC = Integer.parseInt(JOptionPane.showInputDialog("Calculando perimetro \n Digite la altura del rectangulo"));  
                              Rectangulo objRect1 = new Rectangulo(baseRect, alturaREC);
                              JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+objRect1.CalcularPerimetro());
                            break;                                    
                        }                        
                    break;
            }            
        } while (selector !=0);
           JOptionPane.showMessageDialog(null, "Fin del sistema");        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
      
    }
    
}
