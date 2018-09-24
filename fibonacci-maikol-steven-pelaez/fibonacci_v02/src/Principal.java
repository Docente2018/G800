
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        variables para el incremento de la serie fibonacci
         */
        int num1 = 0;
        int num2 = 1;
        int tem;
        int cont = 2;
        int cont2 = 0;
        int limite = 0;
        do {
            //se genera un try  ya que puede presentar excepciones y hay que capturarlas para que no totie la aplicación
            try {

                System.out.println("Ingresa numero de la iteracion:");

                 limite = Integer.parseInt(sc.next());
                System.out.println("_________________________________");

            } catch (Exception e) {

                System.out.println("Solo se permiten numeros");

            }

            if (limite > 0) {
                cont2 = 0;
                cont2 = 3;

                System.out.println("1)" + num1);
                System.out.println("2)" + num2);

                while ((num1 + num2) <= limite - 1) {
                    cont++;
                    tem = num1;
                    num1 = num2;
                    num2 = tem + num1;

                    System.out.println(cont + ")" + num2);

                }

            } else {
                cont2++;
            }

        } while (cont2 < 3);

    }

}
