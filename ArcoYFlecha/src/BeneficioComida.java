import java.util.ArrayList;

public class BeneficioComida extends Beneficio implements BenefAcumulable {
    private ArrayList<String> comidas;
    public BeneficioComida(String nombre, String creador, String desc, boolean acumulable, ArrayList<String> comidas) {
        super(nombre, creador, desc, true);
        this.comidas = comidas;
    }

    public ArrayList<String> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<String> comidas) {
        this.comidas = comidas;
    }

    public void agregarComida(String c){
        comidas.add(c);
    }
    public double aplicarDescuentoExtra(){
        return 4500;
    }
}