/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;


/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo extends Figura {
    
     private double base; //private hace que no se pueda acceder externamente
    private double altura;

    public Rectangulo(double base, double altura, long id) {
        super(id); //llamamos al constructor de fig geom.
        this.base = base;
        this.altura = altura;
    }

     @Override
    public double calculaArea()
    {
        return (base*altura);
    }


     //@Override
    public double calculaPerimetro()
    {
        return (2*base)+(2*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                "}";
    }
}
