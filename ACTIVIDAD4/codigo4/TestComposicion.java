package codigo4;

public class TestComposicion {
    public static void main(String[] args) {
        
        Persona p1 = new Persona(101, "Fernanda", "Briceño", 5001);
        Persona p2 = new Persona(102, "Maria", "Franco", 5002);
        
        p1.getCuenta().setSaldo(1200.50);
        p2.getCuenta().setSaldo(3400.00);
        
        System.out.println(" PRUEBA DE COMPOSICIÓN ");
        System.out.println(p1);
        System.out.println(p2);
    }
}
