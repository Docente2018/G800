/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo extends Figura{
    private float _base;
    private float _altura;
    public Rectangulo(String nombre, float base, float altura) {
        super(nombre);
        this._base = base;
        this._altura = altura;
    }

    public float getBase() {
        return _base;
    }

    public void setBase(float _base) {
        this._base = _base;
    }

    public float getAltura() {
        return _altura;
    }

    public void setAltura(float _altura) {
        this._altura = _altura;
    }

    @Override
    public void CalcularArea() {
        this.setArea(_base*_altura);
    }

    @Override
    public void CalcularPerimetro() {
        this.setPerimetro(2*(_base + _altura) );
    }

    @Override
    public String showData() {
        CalcularPerimetro();
        CalcularArea();
        return "Nombre:" + this.getNombre() + "\nÁrea:" + this.getArea()+
                "\nPerímetro:" + this.getPerimetro();
    }
}
