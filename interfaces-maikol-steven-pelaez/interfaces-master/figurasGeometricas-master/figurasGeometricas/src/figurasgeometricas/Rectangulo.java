/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo  extends Figura{
    
    private int baseRecta;
    private int alturaRecta;

    public Rectangulo(int baseRecta, int alturaRecta) {
        super();
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }

    public int getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(int baseRecta) {
        this.baseRecta = baseRecta;
    }

    public int getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(int alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public double calcularArea() {
      double totalArea=0;
         totalArea=baseRecta*alturaRecta;
         return totalArea;
    }

    @Override
    public double calcularPerimetro() {
        double totalPerimetro=0;
        totalPerimetro=2*(baseRecta + alturaRecta);
         return totalPerimetro;
    }

    @Override
    public void ejecutarFigura() {
          System.out.println("Figura: "+getNombreFigura()+"\n");
          System.out.println("Area del "+getNombreFigura()+": "+calcularArea()+"\n");
          System.out.println("Perimetro del "+getNombreFigura()+": "+calcularPerimetro()+"\n");
    }

    
    
   
    
    
    
}
