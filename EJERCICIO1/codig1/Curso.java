package codig1;
class Curso {
    public static final int MAX_CAPACIDAD = 30;

    private String codigo;
    private String nombre;
    private Categoria categoria;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Curso(String codigo, String nombre, String nombreCategoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = new Categoria(nombreCategoria);
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean inscribirEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < MAX_CAPACIDAD) {
            estudiantes.add(estudiante);
            return true;
        }
        System.out.println("Capacidad máxima alcanzada en el curso: " + nombre);
        return false;
    }

    public void mostrarDetalles() {
        System.out.println("\n=================================");
        System.out.println("Curso: " + nombre + " (" + codigo + ") | Categ: " + categoria.getNombreCategoria());
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
        System.out.println("INSCRITOS: " + estudiantes.size() + " / " + MAX_CAPACIDAD);
        System.out.println("---------------------------------");
        for (Estudiante e : estudiantes) {
            e.mostrarInformacion();
        }
    }
}
