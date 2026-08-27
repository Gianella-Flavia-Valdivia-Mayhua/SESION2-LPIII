package codigo2;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Objeto> objetos;

    public Inventario() {
        objetos=new ArrayList<Objeto>();
    }

    public void agregar_objeto(Objeto objeto) {
        objetos.add(objeto);
        System.out.println("Se agrego "+objeto.getNombre()+" al inventario");
    }

    public void mostrar_objetos() {
        System.out.println("Objetos del inventario:");

        for(Objeto objeto:objetos) {
            System.out.println("- "+objeto.getNombre()+" - "+objeto.getTipo());
        }
    }
}