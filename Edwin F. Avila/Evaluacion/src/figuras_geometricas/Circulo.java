package figuras_geometricas;


/**
 *
 * @author ESTUDIANTE
 */
public class Circulo extends Figura {
    
 public double radio;

    public Circulo(double radio,long id) {
        super(id); //llamamos al constructor de fig geom.
        this.radio = radio;
    }

 @Override
    public double calculaArea() {
        return (Math.PI * (Math.pow(radio, 2)));
    }

// @Override
    public double calculaPerimetro() {
        return (2 * Math.PI * radio);
    }

    public double calculaDiametro() {return radio*2;}

    @Override
    public String toString() {
        return "Circunferencia{" +
                "id=" + id +
                ", radio=" + radio +
                '}';
    }
}
