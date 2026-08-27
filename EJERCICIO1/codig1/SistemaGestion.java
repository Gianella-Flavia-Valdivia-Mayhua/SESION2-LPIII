package codig1;
public class SistemaGestion {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("P10", "Carlos Santillana", "Programación");
        Profesor prof2 = new Profesor("P20", "Ana Guevara", "Matemáticas");

        Curso curso1 = new Curso("C01", "POO en Java", "Programación");
        Curso curso2 = new Curso("C02", "Álgebra Lineal", "Matemáticas");

        curso1.asignarProfesor(prof1);
        curso2.asignarProfesor(prof2);
}
}
