package Biblioteca_Virtual;
import java.time.LocalDate;
public class Autor extends Persona {

    public Autor(String nombre, int dni, LocalDate nacimiento){
        super(nombre, null, dni, nacimiento, null);
    }
}