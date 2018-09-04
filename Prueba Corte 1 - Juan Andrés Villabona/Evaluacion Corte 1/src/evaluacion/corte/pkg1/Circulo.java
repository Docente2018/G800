package evaluacion.corte.pkg1;


public class Circulo extends Figura{

    private double radioCirc;

    public void establecerRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }
    
    // Métodos abstractos de clase Figura  
    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(radioCirc,2);
    }

    @Override
    public void calcularPerim() {
        this.perim = 2 * (Math.PI * radioCirc);
    }
    
}
