import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private int nivelDificultad;
    private HashMap<String, Integer> puntaje;

    public Diana(String nombre, int nivelDificultad, HashMap<String, Integer>puntaje) {
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
        if(!puntaje.containsValue(puntos)) {
            puntaje.put(color, puntos);
        }
        else{
            System.out.println("El puntaje ya está en otra diana");
        }
    }
    public abstract double calcularArea();

    public abstract String getTipo();
}
