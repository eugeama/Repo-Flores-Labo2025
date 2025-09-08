import java.util.HashMap;

public class DianaCircular extends Diana {
    private double radio=13.0;

    public DianaCircular(String nombre, int nivelDificultad,
                         HashMap<String, Integer> puntaje,double radio) {
        super(nombre, nivelDificultad, puntaje);
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }


    @Override
    public String getTipo(){
        return "Circular";
    }
}
