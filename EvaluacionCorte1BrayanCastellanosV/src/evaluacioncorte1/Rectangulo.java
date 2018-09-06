/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacioncorte1;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo extends ClaseAbstract {

    public double baseRecta;
    public double alturaRecta;

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public double calcularArea() {
      return this.baseRecta * this.alturaRecta;
    }

    @Override
    public double calcularPerim() {
        return 2 * this.baseRecta + 2* this.alturaRecta;
    }

}
