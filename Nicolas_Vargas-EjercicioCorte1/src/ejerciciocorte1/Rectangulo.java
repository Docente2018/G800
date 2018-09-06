/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo {
    private int baseRectangulo;
    private int alturaRectangulo;

    public Rectangulo(int baseRectangulo, int alturaRectangulo) {
        this.baseRectangulo = baseRectangulo;
        this.alturaRectangulo = alturaRectangulo;
    }

    public int getAlturaRectangulo() {
        return alturaRectangulo;
    }

    public void setAlturaRectangulo(int alturaRectangulo) {
        this.alturaRectangulo = alturaRectangulo;
    }

    public int getBaseRectangulo() {
        return baseRectangulo;
    }

    public void setBaseRectangulo(int baseRectangulo) {
        this.baseRectangulo = baseRectangulo;
    }
    public int CalcularArea(){
        return baseRectangulo * alturaRectangulo;
    }
    public int CalcularPerimetro(){
        return 2*baseRectangulo + alturaRectangulo;
    }
}
