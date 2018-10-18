package figuras_geometricas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author ESTUDIANTE
 */
public class Figuras_Geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        List<Figura> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de  figuras geometricas para cada tipo:  ");
        int numero = sc.nextInt();


        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos del circulo  "+i);
            System.out.println("Introduce el radio:");
            double radio = sc.nextDouble();

            arrayList.add(new Circulo(radio,i));


        }
        for(int i=1; i<=numero; i++)
        {
            System.out.println("Introduce los datos del triangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            System.out.println("Introduce el lado1:");
            double lado1 = sc.nextDouble();
            System.out.println("Introduce el lado2:");
            double lado2 = sc.nextDouble();

            Triangulo triangulo = new Triangulo(base,altura,lado1, lado2, i+numero);
            arrayList.add(triangulo);
        }

        for(int i=1; i<=numero; i++)
        {
            System.out.println("Introduce los datos del rectangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            //introduzco un cambio de prueba

            Rectangulo rectangulo = new Rectangulo(base,altura,i+numero*2);
            arrayList.add(rectangulo);
        }

        Figura max= null;
        double totalArea = 0.0;

        for(Figura figuraGeometrica : arrayList) // recorremos el array
        {
            double areaActual = figuraGeometrica.calculaArea();
            //double perimetro = figuraGeometrica.calculaPerimetro();
            System.out.println("El area de la figura geometrica " + figuraGeometrica.getId() + " es = " + areaActual);
            //System.out.println("El perimetro de la figura geometrica " + " es =" + perimetro);
            totalArea = totalArea + areaActual; // suma las areas de todas las figuras

            if(figuraGeometrica instanceof Circulo)
            {
                Circulo circunferencia = (Circulo) figuraGeometrica;
               // cast permite tratar la fig como una circunferencia
                double diametro = circunferencia.calculaDiametro();
                System.out.println("El diametro de la circunferencia es = " +diametro);
            }


            if (max == null)
            {
                max = figuraGeometrica;
            }
            else
            {
                if (areaActual > max.calculaArea())
                {
                    max = figuraGeometrica;
                }
            }
        }

        int totalFiguras = numero*3;  //porque tenemos 3 subclases de figuras
        double media = totalArea/totalFiguras;
        System.out.println("La media del area de las fig. geom es= "+ media);
        System.out.println("La figura geometrica de area maxima es: " + max);

    
       
}
}