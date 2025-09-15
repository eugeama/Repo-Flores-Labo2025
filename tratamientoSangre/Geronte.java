package tratamientoSangre;

import java.time.LocalDate;

public class Geronte extends Paciente {
    private int edad;

    public Geronte(String nombre, String apellido, int dni, LocalDate nacimiento,
                   String genero, String tipoSangre, int edad) {
        super(nombre, apellido, dni, nacimiento, genero, tipoSangre);
        this.edad = edad;
    }

    @Override
    public boolean puedeSolicitarTratamiento() {
        return false;
    }

    @Override
    public double calcularCostoTratamiento() {
        return 0;
    }
}

