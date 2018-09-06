/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacioncorte1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class EvaluacionCorte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        ClaseAbstract claseAbs;       
        Scanner  datosFig =  new Scanner(System.in);
       int opc= 1;
        while (opc != 0){        
        System.out.println("areas y perimetros figuras Geometricas\nPara operar escoja una opción \n 1. Triangulo\n 2.Cuadrado\n 3. Rectangulo \n 4.Circulo \n. 5.Fin");        
        Scanner obtener = new Scanner(System.in); 
        opc= obtener.nextInt();
        if(opc== Integer.valueOf(opc)){                   
            switch(opc){               
                case 1:
                     double MedidaFigura; 
                      Triangulo triangulo = new Triangulo();
                    System.out.println("Digite:");
                    System.out.println("\n 1. Base");                    
                    MedidaFigura = datosFig.nextDouble();
                    triangulo.setBaseTria(MedidaFigura);
                    
                    System.out.println("\n2. Altura");                  
                    MedidaFigura = datosFig.nextDouble();
                    triangulo.setAlturaTria(MedidaFigura);
                    
                    System.out.println("\n3. LadoA");            
                    MedidaFigura = datosFig.nextDouble();
                    triangulo.setLadoA(MedidaFigura);
                    
                    System.out.println("\n4. LadoB");                  
                    MedidaFigura = datosFig.nextDouble();
                    triangulo.setLadoB(MedidaFigura);
                    
                    System.out.println("\n4. LadoC");                  
                    MedidaFigura = datosFig.nextDouble();
                    triangulo.setLadoC(MedidaFigura);    
                    System.out.println("El area del triangulo es:\n");
                    triangulo.setNomFigura("Triangulo");                   
                    calcular(triangulo);
                      break;
                case 2:          
                    Cuadrado cuadrado  =  new Cuadrado();
                    System.out.println("Digite: 1. el lado del cuadrado"); 
                    MedidaFigura = datosFig.nextDouble();
                    cuadrado.setLadoCuad(MedidaFigura);
                   cuadrado.setNomFigura("Cuadrado");                    
                    calcular(cuadrado);
                      break;
                case 3:
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("Digite: 1. base del rectangulo\n"); 
                    MedidaFigura = datosFig.nextDouble();
                    rectangulo.setBaseRecta(MedidaFigura);
                    System.out.println("2. altura del rectangulo\n"); 
                    MedidaFigura = datosFig.nextDouble();
                    rectangulo.setAlturaRecta(MedidaFigura);
                    rectangulo.setNomFigura("Rectangulo");
                    
                    calcular(rectangulo);
                      break;
                case 4:
                     Circulo circulo = new Circulo();
                    System.out.println("Digite: 1. el radio del circulo"); 
                    MedidaFigura = datosFig.nextDouble();
                    circulo.setRadioCirculo(MedidaFigura);
                    circulo.setNomFigura("Circulo");                    
                    calcular(circulo);
                    
                    break;
                    
                case 5:
                opc=0; 
                  break;
            } 
            
        }else{
            System.out.println("Debe ser un numero entero");
           }
        }
        System.out.println("ha salido Exitosamente del programa");
       
    }
    public static void calcular(ClaseAbstract clase){    
            System.out.println("La figura "+clase.getNomFigura());
            System.out.println("\n tiene un area de "+clase.calcularArea());
            System.out.println("\n tiene un perimetro de "+ clase.calcularPerim());            
        
    }
}
