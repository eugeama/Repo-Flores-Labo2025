import java.time.LocalDate;

public abstract class Trabajador extends Persona implements Campania {
    private int CUIL;
    private int sueldo;
    private String direccion;

    public Trabajador(String nombre, String apellido, int dni, LocalDate nacimiento, LocalDate antiguedad, int CUIL) {
        super(nombre, apellido, dni, nacimiento);
        this.CUIL = CUIL;
        this.sueldo=sueldo;
        this.direccion=direccion;
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
}
