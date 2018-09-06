package evaluacion.corte.pkg1;

public class Cuadrado extends Figura {

    private double ladoCuad;

    public void establecerLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }    
    
    // Métodos abstractos de clase Figura
    @Override
    public void calcularArea() {
        this.area = Math.pow(ladoCuad, 2);
    }

    @Override
    public void calcularPerim() {
        this.perim = ladoCuad * 4;
    }
    
}
