package codigo2;
import java.util.ArrayList;

public abstract class PersonajeBase {
    static int numero_personaje=0;
    static final int maxim_nivel=10;

    private final int maxim_vida=3;
    private String nombre;
    private String tipo_personaje;
    private String poder;
    private int vida;
    private int nivel;
    private double danio;
    private ArrayList<Habilidad> habilidades;
    private Inventario inventario;

    public PersonajeBase(String nombre,String tipo_personaje,String poder,Inventario inventario) {
        this.setNombre(nombre);
        this.setTipo_personaje(tipo_personaje);
        this.setPoder(poder);
        this.setVida(maxim_vida);
        this.nivel=1;
        this.danio=1.0;
        this.habilidades=new ArrayList<Habilidad>();
        this.inventario=inventario;
        numero_personaje++;
    }

    public abstract void atacar(PersonajeBase p);

    public abstract void usarHabilidad(PersonajeBase p);

    public void usarHabilidad(PersonajeBase p,Habilidad habilidad) {
        System.out.println(this.getNombre()+" usa "+habilidad.getNombre()+" sobre "+p.getNombre());
        this.disminuir_vida(p);
    }

    private void disminuir_vida(PersonajeBase p) {
        if(p.getVida()<=0) {
            System.out.println(p.getNombre()+" murio");
        }else {
            p.setVida(p.getVida()-1);
            System.out.println("A "+p.getNombre()+" le quedan "+p.getVida()+" vidas");
        }
    }

    protected void aumentar_danio() {
        this.danio=this.danio+0.2;
        System.out.println("Se potencio el poder de "+this.getNombre());
    }

    void subir_nivel() {
        if(this.nivel<maxim_nivel) {
            this.nivel++;
            System.out.println(this.getNombre()+" subio al nivel "+this.nivel);
        }else {
            System.out.println(this.getNombre()+" ya alcanzo el nivel maximo");
        }
    }

    public void agregar_habilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
        System.out.println(this.getNombre()+" aprendio "+habilidad.getNombre());
    }

    public void recoger_objeto(Objeto objeto) {
        inventario.agregar_objeto(objeto);
        System.out.println(this.getNombre()+" recogio "+objeto.getNombre());
    }

    public void mostrar_informacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo_personaje);
        System.out.println("Poder: "+poder);
        System.out.println("Vida: "+vida);
        System.out.println("Nivel: "+nivel);
        System.out.println("Daño: "+danio);
    }

    public static void mostrar_numero_personajes() {
        System.out.println("Numero de personajes creados: "+numero_personaje);
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        if(vida<0) {
            this.vida=0;
        }else if(vida>maxim_vida) {
            this.vida=maxim_vida;
        }else {
            this.vida=vida;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getTipo_personaje() {
        return tipo_personaje;
    }
    public void setTipo_personaje(String tipo_personaje) {
        this.tipo_personaje=tipo_personaje;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder=poder;
    }

    public int getNivel() {
        return nivel;
    }

    public double getDanio() {
        return danio;
    }

    public Inventario getInventario() {
        return inventario;
    }
}