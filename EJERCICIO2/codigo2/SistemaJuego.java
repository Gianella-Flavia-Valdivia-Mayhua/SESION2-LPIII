package codigo2;

public class SistemaJuego {

    static final String nombre_mundo="Mundo RPG";

    public void recoger_objeto(PersonajeBase p,Objeto objeto) {
        System.out.println(p.getNombre()+" encontro un objeto");
        p.recoger_objeto(objeto);
    }

    public void subir_nivel(PersonajeBase p) {
        p.subir_nivel();
    }

    public void mostrar_informacion() {
        System.out.println("Mundo: "+nombre_mundo);
        PersonajeBase.mostrar_numero_personajes();
    }
}