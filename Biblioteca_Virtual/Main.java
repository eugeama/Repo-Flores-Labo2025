package Biblioteca_Virtual;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Sistema s = new Sistema();

        Autor a1 = new Autor("Fede", 23965, LocalDate.of(2010, 1, 2));
        Autor a2 = new Autor("Bob", 23967, LocalDate.of(2011, 7, 3));
        Autor a3 = new Autor("Paul", 23912, LocalDate.of(2019, 8, 4));

        Libro l1 = new Libro("Ala", a1, Generos.SAGA);
        Libro l2 = new Libro("Alo", a2, Generos.CIENCIA_FICCION);
        Libro l3 = new Libro("Alu", a3, Generos.NO_FICCION);

        Usuario u1 = new Usuario("Jorge", "Peruz", 482312, LocalDate.of(2004, 10, 13), LocalDate.of(2025, 11, 21), "example@gmail.com", Membresias.BRONCE);
        Usuario u2 = new Usuario("Jorga", "Peraz", 482310, LocalDate.of(1994, 10, 30), LocalDate.of(2024, 12, 22), "example@gmail.com", Membresias.ORO);
        Usuario u3 = new Usuario("Jorgu", "Perez", 482311, LocalDate.of(2007, 12, 31), LocalDate.of(2023, 12, 12), "example@gmail.com", Membresias.PLATA);

        HashMap<Libro, Integer> libros = new HashMap<>();
        libros.put(l1, 145);
        libros.put(l2, 50);
        libros.put(l3, 144);
        HashMap<Usuario, Integer> usuarios = new HashMap<>();
        usuarios.put(u1, 5);
        usuarios.put(u2, 10);
        usuarios.put(u3, 50);
    }
}