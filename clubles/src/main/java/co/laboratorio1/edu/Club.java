package co.laboratorio1.edu;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.laboratorio1.edu.Deporte;

public class Club {
    
    private Deporte deporte;
    private Miembro miembros;

    public Club (Deporte deporte){
        this.deporte = deporte;
        this.miembros = new ArrayList<>();
    }

  public Deporte getDeporte() {
        return deporte;
    }
    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    public Miembro getMiembros() {
        return Miembros;
    }
    public void setMiembros(Miembro miembros) {
        Miembros = miembros;
    }

    public void inscripcion (){

      if (miembros.getTipoMiembro() == "JUVENILES"){

        JOptionPane.showMessageDialog(null,"No puedes inscribirte a un club con este tipo de dificultad" );
        
        return miembros;

      }

       
    }
    
}
