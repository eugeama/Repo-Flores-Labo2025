package SistCalorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private LocalDate fecha_nac;
    private HashMap<Plato, Integer> consumidos;

    public Persona(String nombre, LocalDate fecha_nac, HashMap<Plato, Integer> consumidos) {
        this.nombre=nombre;
        this.fecha_nac=fecha_nac;
        this.consumidos=consumidos;
    }
    public Persona(){
        this.nombre="Ana";
        this.fecha_nac=LocalDate.of(2008,06,02);
        this.consumidos=new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int caloriasConsumidas() {
        int sumaCalorias=0;
            for(Map.Entry<Plato, Integer>entry: consumidos.entrySet()){
                Plato plato=entry.getKey();
                Integer cant= entry.getValue();
                sumaCalorias+= plato.getCalorias()*cant;
            }
    return sumaCalorias;
    }
}
