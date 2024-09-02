package co.laboratorio1.edu;

public class Deporte {

    private String nombre;
    private String descripcion;
    private NivelDificultad nivelDificultad;
    private Entrenador entrenadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public NivelDificultad getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(NivelDificultad nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    public Entrenador getEntrenadores() {
        return entrenadores;
    }
}
