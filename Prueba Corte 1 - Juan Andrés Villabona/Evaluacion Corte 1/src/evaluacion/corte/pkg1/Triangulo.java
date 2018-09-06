package evaluacion.corte.pkg1;


public class Triangulo extends Figura{

    //Atributos
    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC;

    
    // Establecer valores
    public void establecerBaseTria(double base) {
        this.base = base;
    }

    public void establecerAlturaTria(double altura) {
        this.altura = altura;
    }

    public void establecerLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void establecerLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void establecerLadoC(double ladoC) {
        this.ladoC = ladoC;
    }    
    
    // Métodos abstractos de clase Figura
    @Override
    public void calcularArea() {
        this.area = (base * altura) / 2;
    }

    @Override
    public void calcularPerim() {
        this.perim = ladoA + ladoB + ladoC;
    }
    
}
