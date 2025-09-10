import java.util.ArrayList;
import java.util.HashSet;

public class Bar {
    private String nombre;
    private ArrayList<Diana> dianas = new ArrayList<>();
    private int cantClientes;
    private double dineroRecaudado;
    private HashSet<Beneficio> beneficios = new HashSet<>();
    private HashSet<BenefAcumulable> benefAcum = new HashSet<>();

    public Bar(String nombre, ArrayList<Diana> dianas, int cantClientes, double dineroRecaudado,
               HashSet<Beneficio> beneficios, HashSet<Beneficio>benefAcum) {
        this.nombre = nombre;
        this.dianas=dianas;
        this.cantClientes=cantClientes;
        this.dineroRecaudado=dineroRecaudado;
        this.beneficios=beneficios;
        this.benefAcum=benefAcum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(ArrayList<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Beneficio> getBenefAcum() {
        return benefAcum;
    }

    public void setBenefAcum(HashSet<Beneficio> benefAcum) {
        this.benefAcum = benefAcum;
    }

    public void agregarDiana(Diana d){
        dianas.add(d);
    }
    public void agregarBeneficio(Beneficio b){
        beneficios.add(b);
        if(b.isAcumulable()){
            benefAcum.add(b);
        }
    }

    public void registrarCliente(double pago){
        cantClientes++;
        dineroRecaudado +=pago;
    }

    public int cantNoAcumulables(){ //2
        int contador=0;
        for(Beneficio b: beneficios){
            if(!(b instanceof BenefAcumulable)) {
                contador ++;
            }
        }
        return contador;
    }

    public Diana masPuntajes() { //3
        if (dianas.isEmpty()) {
            return null;
        }
        Diana mejorDiana = dianas.get(0);
        for (Diana d : dianas) {
            if (d.getPuntaje().size() > mejorDiana.getPuntaje().size()) {
                mejorDiana = d;
            }
        }
        return mejorDiana;
    }
}
