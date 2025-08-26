package Biblioteca_Virtual;

public class Libro {
    private String titulo;
    private Autor autor;
    private Generos genero;
    private String nom_pdf;
    private static int descargasDisp = 145;
    private String pipis;
    private Autor a1;
    private Generos generos;

    public Libro(String titulo, Autor autor, Generos genero){
        this.titulo= titulo;
        this.autor= autor;
        this.genero= genero;
        this.nom_pdf= titulo + ".pdf";
    }

    public Libro(String pipis, Biblioteca_Virtual.Autor a1, Generos generos) {
        this.pipis = pipis;
        this.a1 = a1;
        this.generos = generos;
    }

    public static int getDescargasDisp() {
        return descargasDisp;
    }

    public static void setDescargasDisp(int descargasDisp) {
        Libro.descargasDisp = descargasDisp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getPdf() {
        return nom_pdf;
    }

    public void setPdf(String nom_pdf) {
        this.nom_pdf = nom_pdf;

    }
}

