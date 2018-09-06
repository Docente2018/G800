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
public class Rectangulo extends Figura {

    private int baseRect;
    private int altura;
    int perimetro, area;

    public Rectangulo() {
        this.altura = altura;
    }

    public int getBaseRect() {
        return baseRect;
    }

    public void setBaseRect(int baseRect) {
        this.baseRect = baseRect;
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

        area = (baseRect * altura);
        System.out.println("...................................\n"
                + "El area del " + nomFigura + " es: " + area);
    }

    @Override
    public void calcularPerim() {
        perimetro = 2 * (baseRect * altura);
        System.out.println("El perimetro del " + nomFigura + " es: " + perimetro);
    }

    @Override
    public void obtenerArea() {
    }

    @Override
    public void obtenerPerim() {
    }

}
