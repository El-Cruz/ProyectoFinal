//Puede incluir especialidad, horario, citas asignadas.
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Usuario{

    private String especialidad;
    private List<Cita> citasAsignadas;

    public Medico(String nombre, String correo, String contrasena, String especialidad) {
        super(nombre, correo, contrasena);
        this.especialidad = especialidad;
        this.citasAsignadas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Cita> getCitasAsignadas() {
        return citasAsignadas;
    }

    public void asignarCita(Cita cita){
        citasAsignadas.add(cita);
    }

    @Override
    public String getTipo() {
        return "Medico";
    }
}
