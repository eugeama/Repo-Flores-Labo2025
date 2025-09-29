package MasterChef;

import java.time.LocalDate;
import java.time.LocalTime;

public class Expertos extends Participante {
    private static LocalTime tiempoDePreparacion = LocalTime.of(1, 20);
    private LocalTime tiempoActual;

    public Expertos(LocalTime tiempoActual, String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento) {
        super(localidad, color, nombre, apellido, dni, nacimiento);
        this.tiempoActual = tiempoActual;
    }

    public static LocalTime getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }

    public static void setTiempoDePreparacion(LocalTime tiempoDePreparacion) {
        Expertos.tiempoDePreparacion = tiempoDePreparacion;
    }

    public LocalTime getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(LocalTime tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public void mensaje() {
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + tiempoActual.minusMinutes(5));
    }

    @Override
    public void cocinarPlato(Plato plato) throws Exception {
        int tiempoPlato = plato.getTiempoPreparacion();
        int tiempoRestante = tiempoActual.getHour() * 60 + tiempoActual.getMinute();

        if (tiempoPlato > tiempoRestante) {
            throw new SinTiempo();
        }

        int minutosRestantes = tiempoRestante - tiempoPlato;
        tiempoActual = LocalTime.of(minutosRestantes / 60, minutosRestantes % 60);

        System.out.println("El experto cocino el plato: " + plato.getNombre() + ". Tiempo restante: "
                + tiempoActual.getHour() + ":" + tiempoActual.getMinute());
    }

    @Override
    public void servirPlato(Plato plato) {
        System.out.println("El experto sirvio el plato: " + plato.getNombre());
    }
}