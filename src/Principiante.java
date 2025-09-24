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

    public void cocinarPlato(){
        for (Ingrediente aux : ingredProhibidos){
            if (ingredProhibidos.contains(aux)){
                //excepcion
            }
        }
    }
}
