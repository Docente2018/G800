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
public abstract class ClaseAbstract {
   public String nomFigura;
   public String area;
   public String perim;

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerim() {
        return perim;
    }

    public void setPerim(String perim) {
        this.perim = perim;
    }


 public void establecerNomFigura(){}
  public void obtenerNomFigura(){}
  public  abstract double  calcularArea();
 public  abstract double  calcularPerim();
 public  void  obtenerArea(){}
  public  void  obtenerPerimetro(){}
}
