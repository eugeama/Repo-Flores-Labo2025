import java.util.ArrayList;

public class BeneficioTrago extends Beneficio {
    private ArrayList<String> tragos;
    public BeneficioTrago(String nombre, String creador, String desc, ArrayList<String> Trago) {
        super(nombre, creador, desc, false);
    }

    public ArrayList<String> getTragos() {
        return tragos;
    }
    public void setTragos(ArrayList<String> tragos) {
        this.tragos = tragos;
    }

    public void agregarTrago(String t){
        tragos.add(t);
    }
}