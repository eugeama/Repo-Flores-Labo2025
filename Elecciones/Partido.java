import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Campania> mensajeros;

    public Partido(String nombre, String direccion, int cantAfiliados, HashSet<Campania> mensajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = mensajeros;
    }
    public Partido(){
        this.nombre="Camilo";
        this.direccion="Atenas 231";
        this.cantAfiliados=25;
        this.mensajeros=new HashSet<>();
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
    public HashSet<Campania> getMensajeros() {
        return mensajeros;
    }
    public void setMensajeros(HashSet<Campania> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero (Campania c){
        mensajeros.add(c);
    }
    public void hacerCampania (Campania m) {
        for (Campania c : mensajeros) {
            c.enviarMensaje();
        }
    }
}
