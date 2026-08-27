package codigo2;
public class Habilidad {

    private String nombre;
    private double danio;

    public Habilidad(String nombre,double danio) {
        this.nombre=nombre;
        this.danio=danio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDanio() {
        return danio;
    }
}