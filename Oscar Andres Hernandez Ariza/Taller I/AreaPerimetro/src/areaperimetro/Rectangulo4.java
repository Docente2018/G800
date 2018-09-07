/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetro;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangulo4 extends Figura4 {

    private float baseRecta;
    private float alturaRecta;

    public void establecerBaseRecta(float baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void establecerAlturaRecta(float alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        super.area = this.baseRecta * this.alturaRecta;
    }

    @Override
    public void calcularPerim() {
        super.perim = 2 * (this.baseRecta + this.alturaRecta);
    }

}
