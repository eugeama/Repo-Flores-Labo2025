package MasterChef;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MasterChefApp {
    public static void main(String[] args) {

        Ingrediente tomate = new Ingrediente("Tomate", 20);
        Ingrediente pollo = new Ingrediente("Pollo", 100);
        Ingrediente queso = new Ingrediente("Queso", 80);

        ArrayList<Ingrediente> ingredientesEntrada = new ArrayList<>();
        ingredientesEntrada.add(tomate);
        ingredientesEntrada.add(queso);
        Plato ensalada = new Plato("Ensalada", Tipos.ENTRADA, 25, ingredientesEntrada);

        ArrayList<Ingrediente> ingredientesPrincipal = new ArrayList<>();
        ingredientesPrincipal.add(pollo);
        ingredientesPrincipal.add(queso);
        Plato polloAlHorno = new Plato("Pollo al Horno", Tipos.PRINCIPAL, 25, ingredientesPrincipal);

        ArrayList<Ingrediente> prohibidos = new ArrayList<>();
        prohibidos.add(pollo);
        Principiante p1 = new Principiante(prohibidos, "Buenos Aires", Colores.ROJO, "Tobias", "Gomez", 12345, LocalDate.of(2008, 9, 12));

        Intermedios i1 = new Intermedios(5, 3, "Córdoba", Colores.VERDE, "Daniel", "Flores", 67890, LocalDate.of(1980, 10, 22));

        Expertos e1 = new Expertos(LocalTime.of(1, 20), "Mendoza", Colores.AZUL, "Pedro", "Perez", 11223, LocalDate.of(2001, 11, 22));


        System.out.println("Cocinar platos");
        try {
            p1.cocinarPlato(ensalada);
            p1.servirPlato(ensalada);
        } catch (Exception exc) {
            System.out.println("Error Principiante: " + exc.getMessage());
        }

        try {
            i1.cocinarPlato(polloAlHorno);
            i1.servirPlato(polloAlHorno);
        } catch (Exception exc) {
            System.out.println("Error Intermedio: " + exc.getMessage());
        }

        try {
            e1.cocinarPlato(polloAlHorno);
            e1.servirPlato(polloAlHorno);
        } catch (Exception exc) {
            System.out.println("Error Experto: " + exc.getMessage());
        }
    }
}
