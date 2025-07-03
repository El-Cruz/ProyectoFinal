//cita médica con fecha, hora, motivo, médico, paciente.
package modelo;

import java.time.LocalDateTime;

public class Cita {

    private LocalDateTime fechaHora;
    private String motivo;
    private Medico medico;
    private Paciente paciente;

    public Cita(LocalDateTime fechaHora, String motivo, Medico medico, Paciente paciente) {
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente(){
        return paciente;
    }
}
