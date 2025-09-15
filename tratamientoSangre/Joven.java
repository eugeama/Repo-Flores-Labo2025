package tratamientoSangre;

import java.time.LocalDate;
import java.util.ArrayList;

public class Joven extends Paciente implements Tratamiento {
    private int edad;
    private ArrayList<Actividades> actividades;
    private static final int EDAD_MIN = 20;
    private static final int EDAD_MAX = 30;

    public Joven(String nombre, String apellido, int dni, LocalDate nacimiento,
                 String genero, String tipoSangre, int edad, ArrayList<Actividades> actividades) {
        super(nombre, apellido, dni, nacimiento, genero, tipoSangre);
        this.edad = edad;
        this.actividades = actividades;
    }


    @Override
    public String solicitarTratamiento() {
        int aniosRestantes = EDAD_MAX - edad;
        if (actividades.size() % 2 != 0 && aniosRestantes <= 2) {
            return "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada";
        } else {
            return "Será un tratamiento costoso, pero lo vamos a lograr";
        }
    }

    @Override
    public double calcularCostoTratamiento() {
        int anio = getNacimiento().getYear();
        int mes = getNacimiento().getMonthValue();
        int dia = getNacimiento().getDayOfMonth();

        if (anio % 2 != 0) {
            return mes * 760000.0;
        }
        else {
            return dia * 145400.0;
        }
    }
}

