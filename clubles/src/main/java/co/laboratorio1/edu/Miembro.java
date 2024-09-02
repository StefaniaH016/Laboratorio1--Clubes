package co.laboratorio1.edu;

public class Miembro extends Persona{

    Super(nombre, correo, id);
    private TipoMiembro tipoMiembro;

    public Miembro (String nombre, String correo, Sring id, TipoMiembro tipoMiembro){
        
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.tipoMiembro = tipoMiembro;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public TipoMiembro getTipoMiembro() {
        return tipoMiembro;
    }
    public void setTipoMiembro(TipoMiembro tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }

    
public void registrarMiembro

}
