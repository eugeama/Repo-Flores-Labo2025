package tratamientoSangre;

import java.util.ArrayList;
import java.util.List;

public class SistemaTratamiento {
    private List<Paciente> pacientes;
    private List<Paciente> enTratamiento;
    private List<Integer> diasTratamiento;

    public SistemaTratamiento() {
        pacientes = new ArrayList<>();
        enTratamiento = new ArrayList<>();
        diasTratamiento = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        if (p != null) pacientes.add(p);
    }

    public void agregarPacienteEnTratamiento(Paciente p) {
        if (p == null) return;
        enTratamiento.add(p);
        diasTratamiento.add(0);
        if (!pacientes.contains(p)) pacientes.add(p);
    }

    public void ejecutarTratamientoDiario() {
        for (int i = 0; i < enTratamiento.size(); i++) {
            Paciente p = enTratamiento.get(i);
            if (p.puedeSolicitarTratamiento()) {
                diasTratamiento.set(i, diasTratamiento.get(i) + 1);
            }
        }
    }

    public int contarNoAplican() {
        int count = 0;
        for (Paciente p : pacientes) {
            if (p instanceof Adulto || p instanceof Gerente)
                    count++;
        }
        return count;
    }

    public void mostrarDiasTratamiento() {
        for (int i = 0; i < enTratamiento.size(); i++) {
            Paciente p = enTratamiento.get(i);
            System.out.println(p.getNombre() + " " + p.getApellido() + " lleva " + diasTratamiento.get(i) + " dias");
        }
    }
}
