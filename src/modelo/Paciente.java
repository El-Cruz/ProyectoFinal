//Puede incluir historial médico, medicamentos, citas.
package modelo;

import java.util.List;
import java.util.ArrayList;

public class Paciente extends Usuario{

    private List<Cita> citas;
    private List<Medicamento> medicamentos;

    public Paciente(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        this.citas = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void agregarCita(Cita cita){
        citas.add(cita);
    }

    public void agregarMedicamento(Medicamento med){
        medicamentos.add(med);
    }

    @Override
    public String getTipo() {
        return "Paciente";
    }
}
