import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

    static HashSet<String> invitados = new HashSet<>();

    public static void main(String[] args) {
        invitados.add("Carlos");
        invitados.add("Juana");
        invitados.add("Román");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre para ver si está invitado:");
        String nombre = sc.nextLine();

        if (invitados.contains(nombre)) {
            System.out.println(nombre + " está en la lista de invitados ");
        } else {
            System.out.println(nombre + " No está en la lista");
        }

        sc.close();
    }
}
