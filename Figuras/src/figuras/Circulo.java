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
public class Circulo extends Figura{
    private float _radio;
    public Circulo(String nombre, float radio) {
        super(nombre);
        this._radio = radio;
    }
    public float getRadio() {
        return _radio;
    }
    public void setRadio(float radio) {
        this._radio = radio;
    }
    @Override
    public void CalcularArea() {
        this.setArea((float)(Math.PI*(_radio*_radio)));
    }
    @Override
    public void CalcularPerimetro() {
        this.setPerimetro((float) (2*Math.PI*_radio));
    }
    @Override
    public String showData() {
        CalcularPerimetro();
        CalcularArea();
        return "Nombre:" + this.getNombre() + "\nÁrea:" + this.getArea()+
                "\nPerímetro:" + this.getPerimetro();
    }
}
