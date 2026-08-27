package codigo2;

public class Arquero extends PersonajeBase implements IAtaqueFisico {

    public Arquero(String nombre,String poder,Inventario inventario) {
        super(nombre,"Arquero",poder,inventario);
    }

    @Override
    public void atacar(PersonajeBase p) {
        System.out.println(getNombre()+" ataca con su arco a "+p.getNombre());
        usar_ataque(p);
    }

    @Override
    public void usarHabilidad(PersonajeBase p) {
        System.out.println(getNombre()+" usa Flecha Precisa sobre "+p.getNombre());
        atacar(p);
    }

    @Override
    public void ataque_fisico(PersonajeBase p) {
        System.out.println(getNombre()+" realiza un ataque fisico a "+p.getNombre());
        atacar(p);
    }

    private void usar_ataque(PersonajeBase p) {
        if(p.getVida()<=0) {
            System.out.println(p.getNombre()+" murio");
        }else {
            p.setVida(p.getVida()-1);
            System.out.println("A "+p.getNombre()+" le quedan "+p.getVida()+" vidas");
        }
    }
}
