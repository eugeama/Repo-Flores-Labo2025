import java.util.ArrayList;

public class BeneficioGaseosa extends Beneficio implements BenefAcumulable {
    private ArrayList<String> gaseosas;
    public BeneficioGaseosa(String nombre, String creador, String desc, boolean acumulable, ArrayList<String> gaseosas) {
        super(nombre, creador, desc, true);
        this.gaseosas = gaseosas;
    }

    public ArrayList<String> getGaseosas() {
        return gaseosas;
    }
    public void setGaseosas(ArrayList<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    public void agregarGaseosa(String g){
        gaseosas.add(g);
    }
    public double aplicarDescuentoExtra(){
        return 1000;
    }
}
