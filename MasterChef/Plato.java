package MasterChef;

import java.util.ArrayList;

public class Plato {
    private String nombre;
    private Tipos tipo;
    private int tiempoPreparacion;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombre, Tipos tipo, int tiempoPreparacion, ArrayList<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
