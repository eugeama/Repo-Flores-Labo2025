package MasterChef;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principiante extends Participante {
    private ArrayList<Ingrediente> ingredProhibidos;

    public Principiante(ArrayList<Ingrediente> ingredProhibidos, String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento) {
        super(localidad, color, nombre, apellido, dni, nacimiento);
        this.ingredProhibidos=ingredProhibidos;
    }

    public ArrayList<Ingrediente> getIngredProhibidos() {
        return ingredProhibidos;
    }

    public void setIngredProhibidos(ArrayList<Ingrediente> ingredProhibidos) {
        this.ingredProhibidos = ingredProhibidos;
    }

    public void mensaje (){
        for (Ingrediente aux : ingredProhibidos)
            System.out.println("a guarde todos los elementos prohibidos y no voy a usar: " + aux.getNombre());
    }

    @Override
    public void cocinarPlato(Plato plato) throws Exception {
        if (plato.getTipo() != Tipos.ENTRADA) {
            throw new Exception("El principiante solo puede cocinar entradas");
        }

        for (Ingrediente ingr : plato.getIngredientes()) {
            if (ingredProhibidos.contains(ingr)) {
                throw new Prohibidos();
            }
        }

        System.out.println("El principiante cocinó el plato de entrada: " + plato.getNombre());
    }

    @Override
    public void servirPlato(Plato plato) throws Exception {
        if (plato.getTipo() != Tipos.ENTRADA) {
            throw new Exception("El principiante solo puede servir entradas");
        }

        System.out.println("El principiante sirvió el plato de entrada: " + plato.getNombre());
    }
}
