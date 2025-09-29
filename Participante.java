package MasterChef;
import java.time.LocalDate;

public abstract class Participante extends Persona {
    private String localidad;
    private Colores color;

    public Participante(String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento){
        super(nombre, apellido, dni, nacimiento);
        this.localidad=localidad;
        this.color=color;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Colores getColores() {
        return color;
    }

    public void setColores(Colores color) {
        this.color = color;
    }

    //Metodos abstractos usadas por las hijas
    public abstract void mensaje();
    public abstract void cocinarPlato(Plato plato) throws Exception;
    public abstract void servirPlato(Plato plato) throws Exception;
}
