//cita médica con fecha, hora, motivo, médico, paciente.
package modelo;

import java.time.LocalDateTime;

public class Cita {

    private LocalDateTime fechaHora;
    private String motivo;
    private String medico;
    private String paciente;

    public Cita(LocalDateTime fechaHora, String motivo, String medico, String paciente) {
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

    public String getMedico() {
        return medico;
    }

    public String getPaciente(){
        return paciente;
    }
}
