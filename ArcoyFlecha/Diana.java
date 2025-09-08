import java.util.HashMap;

public class Diana {
    private String nombre;
    private int nivelDificultad;
    private HashMap<String, Integer> puntaje;

    public Diana(String tipo, int nivelDificultad) {
        this.nombre=nombre;
        this.nivelDificultad=nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public HashMap<String, Integer> getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(HashMap<String, Integer> puntaje) {
        this.puntaje = puntaje;
    }

    public void agregarPuntaje(String color, int puntos){
        
    }
}
