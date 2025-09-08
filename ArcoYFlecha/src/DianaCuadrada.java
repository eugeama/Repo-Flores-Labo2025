import java.util.HashMap;

public class DianaCuadrada extends Diana {
    private double lado;

    public DianaCuadrada(String nombre, int nivelDificultad, HashMap<String,
            Integer> puntaje, double lado) {
        super(nombre, nivelDificultad, puntaje);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    @Override
    public String getTipo(){
        return "Cuadrada";
    }
}
