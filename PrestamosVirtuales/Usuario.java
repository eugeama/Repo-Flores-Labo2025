package PrestamosVirtuales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Usuario extends Persona {
    private int creditoGanado;
    private ArrayList<Publicacion> publicacionesLeidas;
    private HashMap<Publicacion, Integer> prestamos;

    public Usuario(String nombre, String apellido, LocalDate fNacimiento) {
        super(nombre, apellido, fNacimiento);
        this.creditoGanado=creditoGanado;
        this.publicacionesLeidas=new ArrayList<>();
        this.prestamos= new HashMap<>();
    }

    public int getCreditoGanado() {
        return creditoGanado;
    }

    public void setCreditoGanado(int creditoGanado) {
        this.creditoGanado = creditoGanado;
    }

    public ArrayList<Publicacion> getPublicacionesLeidas() {
        return publicacionesLeidas;
    }

    public void setPublicacionesLeidas(ArrayList<Publicacion> publicacionesLeidas) {
        this.publicacionesLeidas = publicacionesLeidas;
    }

    public HashMap<Publicacion, Integer> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashMap<Publicacion, Integer> prestamos) {
        this.prestamos = prestamos;
    }
}
