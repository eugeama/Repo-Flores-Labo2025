import java.time.LocalDate;
import java.time.LocalTime;

public class Expertos extends Participante {
    private static LocalTime tiempoDePreparacion = LocalTime.of(1, 20);
    private LocalTime tiempoActual = LocalTime.of(1, 20);

    public Expertos(LocalTime tiempoActual, String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento) {
        super(localidad, color, nombre, apellido, dni, nacimiento);
        //tiempo de preparacion ya asignado
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

    public void cocinarPlato() {
        if (getTiempoActual().isAfter(tiempoDePreparacion)){
            //excepcion
        }
    }
}