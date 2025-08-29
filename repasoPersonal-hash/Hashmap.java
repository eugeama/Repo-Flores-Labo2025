import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

    static HashMap<String, String> personas = new HashMap<>();

    public static void main(String[] args) {
        personas.put("Carlos", "250455");
        personas.put("Juana", "207833");
        personas.put("Román", "171212");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una persona:");
        String nombre = sc.nextLine();

        if (personas.containsKey(nombre)) {
            System.out.println("El teléfono de " + nombre + " es: " + personas.get(nombre));
        } else {
            System.out.println("Esa persona no está en la agenda.");
        }

        sc.close();
    }
}

