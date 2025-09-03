import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Campania> enviadores;

    public Partido(String nombre, String direccion, int cantAfiliados, HashSet<Campania> enviadores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.enviadores = enviadores;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getCantAfiliados() {
        return cantAfiliados;
    }
    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }
    public HashSet<Campania> getEnviadores() {
        return enviadores;
    }
    public void setEnviadores(HashSet<Campania> enviadores) {
        this.enviadores = enviadores;
    }
}
