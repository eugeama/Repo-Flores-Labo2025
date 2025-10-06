package PrestamosVirtuales;

import java.time.LocalDate;
import java.util.HashSet;

public class BibliotecaApp {
        public HashSet<Publicacion> publicaciones;
        public HashSet<Prestar>publicacionesprestables;
        public HashSet<Prestamo>prestamosRealizados;

    public BibliotecaApp(HashSet<Publicacion> publicaciones, HashSet<Prestar> publicacionesprestables, HashSet<Prestamo> prestamosRealizados) {
        this.publicaciones = publicaciones;
        this.publicacionesprestables = publicacionesprestables;
        this.prestamosRealizados = prestamosRealizados;
    }

    public HashSet<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(HashSet<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public HashSet<Prestar> getPublicacionesprestables() {
        return publicacionesprestables;
    }

    public void setPublicacionesprestables(HashSet<Prestar> publicacionesprestables) {
        this.publicacionesprestables = publicacionesprestables;
    }

    public HashSet<Prestamo> getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(HashSet<Prestamo> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public String verificarStock(Publicacion publicacion) throws Exception{
        if(publicacion.getStock()<0){
            throw new Exception();
        }
        else{
            return "Hay stock disponible";
        }
    }

    public static void main(String[] args) {
        Usuario u = new Usuario("Mateo", "Perez", LocalDate.of(2005,5,4));
        Revista r = new Revista("la flor","baez","Toby Fox",2019,100);
        Libro l = new Libro(true,"la roca", "Nahuel Bustos",2020,200);
    }
}

