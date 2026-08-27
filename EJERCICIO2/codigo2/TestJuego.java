package codigo2;

public class TestJuego {

    public static void main(String[] args) {

        Inventario inventario1=new Inventario();
        Inventario inventario2=new Inventario();
        Inventario inventario3=new Inventario();

        PersonajeBase personaje1=new Guerrero("Mario","Espada legendaria",inventario1);
        PersonajeBase personaje2=new Mago("Luis","Magia de fuego",inventario2);
        PersonajeBase personaje3=new Arquero("Ana","Arco de hielo",inventario3);

        Habilidad habilidad1=new Habilidad("Golpe Poderoso",2);
        Habilidad habilidad2=new Habilidad("Bola de Fuego",2);
        Habilidad habilidad3=new Habilidad("Flecha Precisa",2);

        personaje1.agregar_habilidad(habilidad1);
        personaje2.agregar_habilidad(habilidad2);
        personaje3.agregar_habilidad(habilidad3);

        personaje1.atacar(personaje2);
        personaje2.atacar(personaje1);
        personaje3.atacar(personaje2);

        personaje1.usarHabilidad(personaje2,habilidad1);

        Objeto objeto1=new Objeto("Pocion","Sanacion");

        SistemaJuego sistema=new SistemaJuego();

        sistema.recoger_objeto(personaje1,objeto1);

        personaje1.getInventario().mostrar_objetos();

        sistema.subir_nivel(personaje1);

        personaje1.mostrar_informacion();
        personaje2.mostrar_informacion();
        personaje3.mostrar_informacion();

        sistema.mostrar_informacion();
    }
}