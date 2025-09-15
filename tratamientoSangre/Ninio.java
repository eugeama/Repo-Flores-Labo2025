package tratamientoSangre;

import java.time.LocalDate;

public class Ninio extends Paciente implements Tratamiento {
    private int nivelTolerancia;
    private int edad;

    public Ninio(String nombre, String apellido, int dni, LocalDate nacimiento,
                String genero, String tipoSangre, int nivelTolerancia, int edad) {
        super(nombre, apellido, dni, nacimiento, genero, tipoSangre);
        this.nivelTolerancia = nivelTolerancia;
        this.edad = edad;
    }

    @Override
    public String solicitarTratamiento() {
        if (edad > 3) {
            int dias = nivelTolerancia * 2;
            return "El tratamiento va a tardar: " + dias;
        } else {
            return "Es menor para el tratamiento";
        }
    }

    @Override
    public boolean puedeSolicitarTratamiento() {
        return true;
    }

    @Override
    public double calcularCostoTratamiento() {
        return nivelTolerancia * 450000.0;
    }
}

