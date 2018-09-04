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
public class Cuadrado extends Figura {
    private float _lado;
    public Cuadrado(String nombre,float lado) {
        super(nombre);
        this._lado = lado;
    }

    public float getLado() {
        return _lado;
    }

    public void setLado(float _lado) {
        this._lado = _lado;
    }

    @Override
    public void CalcularArea() {
        this.setArea(_lado*_lado);
    }
    @Override
    public void CalcularPerimetro() {
        this.setPerimetro(4*_lado);
    }
    @Override
    public String showData() {
        CalcularPerimetro();
        CalcularArea();
        return "Nombre:" + this.getNombre() + "\nÁrea:" + this.getArea()+
                "\nPerímetro:" + this.getPerimetro();
    }
    
}
