package co.laboratorio1.edu;

import java.util.ArrayList;

public class Entrenador extends Persona{

    private String especialidad;
    private SesionEntrenamiento sesionesEntrenamientos;
    Super(nombre);

    public Entrenador (String nombre, String especialidad){

        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sesionesEntrenamientos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public SesionEntrenamiento getSesionesEntrenamientos() {
        return sesionesEntrenamientos;
    }
    public void setSesionesEntrenamientos(SesionEntrenamiento sesionesEntrenamientos) {
        this.sesionesEntrenamientos = sesionesEntrenamientos;
    }

    

}
