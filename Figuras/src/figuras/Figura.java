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
public abstract class Figura {
    private String nombre; 
    private float area;
    private float perimetro;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void CalcularArea();
    public abstract void CalcularPerimetro();
    public abstract String showData();
}
