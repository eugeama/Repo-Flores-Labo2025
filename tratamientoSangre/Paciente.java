package tratamientoSangre;

import java.time.LocalDate;

public abstract class Paciente extends Persona {
    protected String genero;
    protected String tipoSangre;

    public Paciente(String nombre, String apellido, int dni, LocalDate nacimiento, String genero, String tipoSangre) {
        super(nombre, apellido, dni, nacimiento);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }
    public abstract boolean puedeSolicitarTratamiento();
    public abstract double calcularCostoTratamiento();
}
