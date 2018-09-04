/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkFiguras;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends Figura {

    private int base;
    private int altura;
    private int lado;
    int perimetro, area;

    public Triangulo() {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void establecerNomFigura() {
    }

    @Override
    public void obtenerNomFigura() {
    }

    @Override
    public void calcularArea() {

        area = (base * altura) / 2;
        System.out.println("...................................\n"
                + "El area del " + nomFigura + " es: " + area);
    }

    @Override
    public void calcularPerim() {
        perimetro = lado + lado + lado;
        System.out.println("El perimetro del " + nomFigura + " es: " + perimetro);
    }

    @Override
    public void obtenerArea() {
    }

    @Override
    public void obtenerPerim() {
    }

}
