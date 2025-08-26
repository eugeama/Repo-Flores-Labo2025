package Biblioteca_Virtual;

import java.time.LocalDate;


//Main incompleto

public class Main {
    public static void main(String[] args) {
        Sistema s= new Sistema();

        Autor a1= new Autor("n", 456, LocalDate.of(2025, 8, 3));
        Autor a2= new Autor("n", 456, LocalDate.of(2024, 7, 2));
        Autor a3= new Autor("n", 456, LocalDate.of(2022, 4, 1));

        Libro l1= new Libro("pipis", a1, Generos.AVENTURA);
        Libro l2= new Libro("pipus", a2, Generos.CIENCIA_FICCION);
        Libro l3= new Libro("pipos", a3, Generos.ROMANCE);

        Biblioteca_Virtual.Usuario u1= new Biblioteca_Virtual.Usuario("usu1", 9120, LocalDate.of(2025, 8, 3), "examp@gmail.com", Membresias.BRONCE);
        Biblioteca_Virtual.Usuario u2= new Biblioteca_Virtual.Usuario("usu2", 9120, LocalDate.of(2024, 7, 2), "examp@gmail.com", Membresias.PLATA);
        Biblioteca_Virtual.Usuario u3= new Biblioteca_Virtual.Usuario("usu3", 9120, LocalDate.of(2022, 4, 1), "examp@gmail.com", Membresias.ORO);
    }
}