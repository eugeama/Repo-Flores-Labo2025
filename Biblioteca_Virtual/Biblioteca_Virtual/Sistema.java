package Biblioteca_Virtual;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private HashMap<Autor, Libro> librosEscritos;
    private HashMap<Libro, Integer> libros;
    private HashMap<Usuario, Integer> usuarios;

    public Sistema(HashMap<Autor, Libro> librosEscritos, HashMap<Libro, Integer> libros,
            HashMap<Usuario, Integer> usuarios) {
        this.librosEscritos = librosEscritos;
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public Sistema() {
        this.librosEscritos = new HashMap<>();
        this.libros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public HashMap<Autor, Libro> getLibrosEscritos() {
        return librosEscritos;
    }
    public void setLibrosEscritos(HashMap<Autor, Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }
    public HashMap<Libro, Integer> getLibros() {
        return libros;
    }
    public void setLibros(HashMap<Libro, Integer> libros) {
        this.libros = libros;
    }
    public HashMap<Usuario, Integer> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(HashMap<Usuario, Integer> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarLibro(Libro nuevoLibro) {
        libros.put(nuevoLibro, 0);
    }

    public void borrarLibro(Libro libroABorrar) {
        for (Map.Entry<Libro, Integer> tLibros : libros.entrySet()) {
            if (tLibros.getKey().equals(libroABorrar)) {
                libros.remove(tLibros);
            }
        }
    }

    public void modificarLibro(Libro libroViejo, Libro libroNuevo) {
        for (Map.Entry<Libro, Integer> tLibros : libros.entrySet()) {
            if (tLibros.getKey().equals(libroViejo)) {
                libros.remove(tLibros);
                libros.put(libroNuevo, 0);
            }
        }
    }


}