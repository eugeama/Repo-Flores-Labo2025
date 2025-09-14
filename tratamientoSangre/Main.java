package tratamientoSangre;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SistemaTratamiento sistema = new SistemaTratamiento();

        ArrayList<Actividades> acts = new ArrayList<>();
        acts.add(Actividades.FUTBOL);
        acts.add(Actividades.NATACION);

        Joven joven1 = new Joven("Lucas", "Gomez", 12345, LocalDate.of(1998, 5, 14), "M", "A+", 27, acts);
        Joven joven2 = new Joven("Ana", "Lopez", 67890, LocalDate.of(1997, 8, 3), "F", "A-", 28, acts);

        Ninio ninio1 = new Ninio("Mateo", "Perez", 11111, LocalDate.of(2020, 3, 10), "M", "AB", 8, 3);
        Ninio ninio2 = new Ninio("Sofia", "Diaz", 22222, LocalDate.of(2022, 7, 25), "F", "AB-", 6, 1);

        Adulto adulto1 = new Adulto("Alberto", "Johnson", 33333, LocalDate.of(1985, 2, 18), "M", "O+", 38);
        Gerente gerente1 = new Gerente("Tobías", "Flores", 44444, LocalDate.of(1945, 11, 30), "F", "B-", 78);

        sistema.agregarPaciente(joven1);
        sistema.agregarPaciente(joven2);
        sistema.agregarPaciente(ninio1);
        sistema.agregarPaciente(ninio2);
        sistema.agregarPaciente(adulto1);
        sistema.agregarPaciente(gerente1);

        sistema.agregarPacienteEnTratamiento(joven1);
        sistema.agregarPacienteEnTratamiento(ninio1);

        sistema.ejecutarTratamientoDiario();

        System.out.println("Pacientes que no aplican al tratamiento: " + sistema.contarNoAplican());
    }
}
