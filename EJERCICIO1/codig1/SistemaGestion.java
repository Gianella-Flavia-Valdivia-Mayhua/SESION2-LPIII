package codig1;
public class SistemaGestion {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("P10", "Carlos Santillana", "Programación");
        Profesor prof2 = new Profesor("P20", "Ana Guevara", "Matemáticas");

        Curso curso1 = new Curso("C01", "POO en Java", "Programación");
        Curso curso2 = new Curso("C02", "Álgebra Lineal", "Matemáticas");

        curso1.asignarProfesor(prof1);
        curso2.asignarProfesor(prof2);
        
        Estudiante est1 = new Estudiante("E01", "Juan Perez", 15.5, 14.0);
        Estudiante est2 = new Estudiante("E02", "Maria Lopez", 18.0, 19.5);
        Estudiante est3 = new Estudiante("E03", "Pedro Gomez", 11.0, 13.5);

        curso1.inscribirEstudiante(est1);
        curso1.inscribirEstudiante(est2);
        curso2.inscribirEstudiante(est3);

        curso1.mostrarDetalles();
        curso2.mostrarDetalles();

        System.out.println("\nTotal de estudiantes registrados en el sistema: " + Estudiante.getTotalEstudiantes());
    }
}
