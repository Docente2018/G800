package evaluacion.corte.pkg1;

public class Rectangulo extends Figura{

    private double baseRecta;
    private double alturaRecta;

    public void establecerBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void establecerAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }   
    
    
    // Métodos abstractos de clase Figura  
    @Override
    public void calcularArea() {
        this.area = baseRecta * alturaRecta;
    }

    @Override
    public void calcularPerim() {
        this.perim = 2 * (baseRecta + alturaRecta);
    }
    
}
