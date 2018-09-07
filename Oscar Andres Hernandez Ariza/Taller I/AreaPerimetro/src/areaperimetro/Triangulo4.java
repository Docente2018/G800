/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetro;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo4 extends Figura4 {

    private float baseTria;
    private float alturaTria;
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public void establecerBaseTria(float baseTria) {
        this.baseTria = baseTria;
    }

    public void establecerAlturaTria(float alturaTria) {
        this.alturaTria = alturaTria;
    }

    public void establecerLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public void establecerLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public void establecerLadoC(float ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public void calcularArea() {
        super.area = (this.baseTria * this.alturaTria) / 2;
    }

    @Override
    public void calcularPerim() {
        super.perim = this.ladoA + this.ladoB + this.ladoC;
    }

}
