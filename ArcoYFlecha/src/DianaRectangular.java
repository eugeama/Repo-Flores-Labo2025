import java.util.HashMap;

public class DianaRectangular extends Diana {
    private double base;
    private double altura;

    public DianaRectangular(String nombre, int nivelDificultad,
                            HashMap<String, Integer> puntaje, double base, double altura) {
        super(nombre, nivelDificultad, puntaje);
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }

    @Override
    public String getTipo(){
        return "Rectangular";
    }
}
