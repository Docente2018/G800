package evaluacion.corte.pkg1;

import java.util.Scanner;

public class EvaluacionCorte1 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {        

        System.out.println("AREAS Y PERIMETROS DE\nFIGURAS GEOMETRICAS");
        int opc;
        
        do{            
            // Visualizar menú
            System.out.println("1. TRIANGULO");
            System.out.println("2. CUADRADO");
            System.out.println("3. RECTANGULO");
            System.out.println("4. CIRCULO");
            System.out.println("5. FIN");
            
            System.out.print("ESCOJA UNA OPCIÓN: ");
            opc = scanner.nextInt();
            System.out.println("");            
            Procesar(opc);
            
        }while(opc != 5);
    }
    
    public static void Procesar(int opc){
        
        String nameF;
        
        //Leer opciones
        switch(opc){
            // Triangulo
            case 1:
                Triangulo tri = new Triangulo();

                System.out.print("Ingrese nombre de la figura: ");
                nameF = scanner.next();
                tri.establecerNomFigura(nameF);
                System.out.println("");

                System.out.print("Ingrese el valor de la base de " + nameF + ": ");
                tri.establecerBaseTria(scanner.nextDouble());
                System.out.println("");

                System.out.print("Ingrese el valor de la altura de " + nameF + ": ");
                tri.establecerAlturaTria(scanner.nextDouble());
                System.out.println("");
                
                System.out.print("Ingrese el valor del lado A de " + nameF + ": ");
                tri.establecerLadoA(scanner.nextDouble());
                System.out.println("");
                
                System.out.print("Ingrese el valor del lado B de " + nameF + ": ");
                tri.establecerLadoB(scanner.nextDouble());
                System.out.println("");
                
                System.out.print("Ingrese el valor del lado C de " + nameF + ": ");
                tri.establecerLadoC(scanner.nextDouble());
                System.out.println("");
                
                tri.calcularArea();
                tri.calcularPerim();
                
                System.out.println("El nombre de la figura es: " + tri.obtenerNomFigura() + "\n" +
                                "El área de la figura es: " + tri.obtenerArea() + "\n" +
                                "El perímetro de la figura es: " + tri.obtenerPerim() + "\n");
                    
                break;
            // Cuadrado    
            case 2:
                Cuadrado cuad = new Cuadrado();
                System.out.print("Ingrese nombre de la figura: ");
                nameF = scanner.next();
                cuad.establecerNomFigura(nameF);
                System.out.println("");
                
                System.out.print("Ingrese el valor del lado de " + nameF + ": ");
                cuad.establecerLadoCuad(scanner.nextDouble());
                System.out.println("");
                
                cuad.calcularArea();
                cuad.calcularPerim();
                
                System.out.println("El nombre de la figura es: " + cuad.obtenerNomFigura() + "\n" +
                                "El área de la figura es: " + cuad.obtenerArea() + "\n" +
                                "El perímetro de la figura es: " + cuad.obtenerPerim() + "\n");
                break;
             // Rectangulo
            case 3:
                Rectangulo rect = new Rectangulo();
                System.out.print("Ingrese nombre de la figura: ");
                nameF = scanner.next();
                rect.establecerNomFigura(nameF);
                System.out.println("");
                
                System.out.print("Ingrese el valor de la base de " + nameF + ": ");
                rect.establecerBaseRecta(scanner.nextDouble());
                System.out.println("");
                
                System.out.print("Ingrese el valor de la altura de " + nameF + ": ");
                rect.establecerAlturaRecta(scanner.nextDouble());
                System.out.println("");
                
                rect.calcularArea();
                rect.calcularPerim();
                
                System.out.println("El nombre de la figura es: " + rect.obtenerNomFigura() + "\n" +
                                "El área de la figura es: " + rect.obtenerArea() + "\n" +
                                "El perímetro de la figura es: " + rect.obtenerPerim() + "\n");
                break;
            // Circulo
            case 4:
                Circulo circ = new Circulo();
                System.out.print("Ingrese nombre de la figura: ");
                nameF = scanner.next();
                circ.establecerNomFigura(nameF);
                System.out.println("");
                
                System.out.print("Ingrese el valor del radio de " + nameF + ": ");
                circ.establecerRadioCirc(scanner.nextDouble());
                System.out.println("");
                
                circ.calcularArea();
                circ.calcularPerim();
                
                System.out.println("El nombre de la figura es: " + circ.obtenerNomFigura() + "\n" +
                                "El área de la figura es: " + circ.obtenerArea() + "\n" +
                                "El perímetro de la figura es: " + circ.obtenerPerim() + "\n");
                break;
        }
    }
    
}
