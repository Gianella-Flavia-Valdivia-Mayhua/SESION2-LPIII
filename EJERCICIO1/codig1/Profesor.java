package codig1;
class Profesor extends Persona {
    private String especialidad;

    public Profesor(String id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor [ID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad + "]");
    }
}
