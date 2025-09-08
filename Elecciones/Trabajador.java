import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trabajador extends Persona implements Campania {
    private int CUIL;
    private int sueldo;
    private String direccion;
    private String mensaje;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Trabajador(String nombre, String apellido, int dni, LocalDate nacimiento,
                      LocalDate antiguedad, int CUIL, String mensaje, LocalTime horaInicio, LocalTime horaFin) {
        super(nombre, apellido, dni, nacimiento);
        this.CUIL = CUIL;
        this.sueldo=sueldo;
        this.direccion=direccion;
        this.mensaje=mensaje;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
    }

    public int getCUIL() {
        return CUIL;
    }

    public void setCUIL(int CUIL) {
        this.CUIL = CUIL;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void enviarMensaje(String mensaje){
        if (LocalTime.now().isBefore(this.horaFin) && LocalTime.now().isAfter(this.horaInicio)) {
            System.out.println("Yo " + this.getNombre() + " te invito a que Voté por el partido para un mejor futuro ");
        }
        else {
            System.out.println(getNombre() + "no puede enviar mensaje");
        }
    }
}
