package figuras_geometricas;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Figura {
 protected long id;
    private String color;

    public Figura(long id, String color) {
        this.id = id;
        this.color = color;
    }

    public Figura(long id) {
        this.id = id;
        this.color = "blue";
    }

    public long getId() {
        return id;
    }

    public abstract double calculaArea();

    //public abstract double calculaPerimetro();

}
