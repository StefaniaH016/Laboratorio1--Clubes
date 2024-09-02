package co.laboratorio1.edu;

import java.time.LocalDate;

public class SesionEntrenamiento {

    private LocalDate fecha;
    private Duration duracion;
    private Estado estado;

    Public SesionEntrenamiento( LocalDate fecha, Duration duracion, Estado estado){

        this.fecha = fecha;
        this.duracion = duracion;
        this.estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
}
