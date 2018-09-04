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
public class Circulo extends Figura {

    private int radioCirculo;
    int perimetro, area;

    public Circulo() {
        this.radioCirculo = radioCirculo;
    }

    public int getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(int radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    @Override
    public void establecerNomFigura() {
    }

    @Override
    public void obtenerNomFigura() {
    }

    @Override
    public void calcularArea() {

        area = (int) (Math.PI * (radioCirculo * radioCirculo));
        System.out.println("...................................\n"
                + "El area del " + nomFigura + " es: " + area);
    }

    @Override
    public void calcularPerim() {
        perimetro = (int) (2 * Math.PI * (radioCirculo));
        System.out.println("El perimetro del " + nomFigura + " es: " + perimetro);
    }

    @Override
    public void obtenerArea() {
    }

    @Override
    public void obtenerPerim() {
    }

}
