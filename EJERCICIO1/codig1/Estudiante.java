package codig1;
class Estudiante extends Persona implements Evaluable {
    private double nota1;
    private double nota2;

    private static int totalEstudiantes = 0;

    public Estudiante(String id, String nombre, double nota1, double nota2) {
        super(id, nombre);
        this.nota1 = nota1;
        this.nota2 = nota2;
        Estudiante.totalEstudiantes++;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2.0;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante [ID: " + id + " | Nombre: " + nombre + " | Promedio: " + calcularPromedio() + "]");
    }
}
