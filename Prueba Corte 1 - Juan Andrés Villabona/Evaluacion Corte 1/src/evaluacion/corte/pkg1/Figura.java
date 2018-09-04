package evaluacion.corte.pkg1;


public abstract class Figura {
    public String nomFigura;
    public double area;
    public double perim;
    
    public void establecerNomFigura(String nombre){
        this.nomFigura = nombre;
    }
    
    public String obtenerNomFigura(){
        return this.nomFigura;
    }
    
    // Métodos abstractos
    public abstract void calcularArea();
    public abstract void calcularPerim();
    
    public double obtenerArea(){
        return this.area;
    }
    
    public double obtenerPerim(){
        return this.perim;
    }
    
}
