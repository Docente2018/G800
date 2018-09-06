/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Triangulo extends Figura{
    private float _base;
    private float _altura;
    private float _lado;
    public Triangulo(String nombre,float base, float altura, float lado) {
        super(nombre);
        this._base = base;
        this._altura = altura;
        this._lado = lado;
    }

    public float getLado() {
        return _lado;
    }

    public void setLado(float _lado) {
        this._lado = _lado;
    }
    public float getBase() {
        return _base;
    }

    public void setBase(int base) {
        this._base = base;
    }

    public float getAltura() {
        return _altura;
    }

    public void setAltura(int altura) {
        this._altura = altura;
    }
    @Override
    public void CalcularArea() {
        float area = (this._base * this._altura)/2;
        this.setArea(area);
    }

    @Override
    public void CalcularPerimetro() {
        this.setPerimetro(this._base+this._altura+this._lado);
    }
    @Override
    public String showData() {
        CalcularPerimetro();
        CalcularArea();
        return "Nombre:" + this.getNombre() + "\nÁrea:" + this.getArea()+
                "\nPerímetro:" + this.getPerimetro();
    }
}
