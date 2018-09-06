/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacioncorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends ClaseAbstract {
 
    
    private double baseTria;
   private double alturaTria;
   private double ladoA,ladoB,ladoC;

    public double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    private double establecerBaseTria(){
       return this.baseTria;
    }
    private double establecerAlturaTria(){
    return this.alturaTria;
    }     
    private double establecerLadoA(){
    return this.ladoA;
    }
    private double establecerLadoB(){
    return this.ladoB;
    }
    private double establecerLadoC(){
    return this.ladoC;
    }

    @Override
    public double calcularArea() {
       double base = this.establecerBaseTria();
       double altura = this.establecerAlturaTria();
       double area =  base * altura/2;
       return area;
    }

    @Override
    public double calcularPerim() {
        double A,B,C;
        A= this.establecerLadoA();
        B= this.establecerLadoB();
        C= this.establecerLadoC();
        double peri = A+B+C;
        return peri;
    }
}
