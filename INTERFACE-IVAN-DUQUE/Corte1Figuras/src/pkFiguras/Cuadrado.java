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
public class Cuadrado extends Figura {

    private int lado;
    int perimetro, area;

    public Cuadrado() {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void establecerNomFigura() {
    }

    @Override
    public void obtenerNomFigura() {
    }

    @Override
    public void calcularArea() {

        area = (lado * lado);
        System.out.println("...................................\n"
                + "El area del " + nomFigura + " es: " + area);
    }

    @Override
    public void calcularPerim() {
        perimetro = 4 * lado;
        System.out.println("El perimetro del " + nomFigura + " es: " + perimetro);
    }

    @Override
    public void obtenerArea() {
    }

    @Override
    public void obtenerPerim() {
    }

}
