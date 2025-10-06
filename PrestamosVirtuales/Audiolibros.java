package PrestamosVirtuales;

public class Audiolibros extends Publicacion {
    private int duracion;
    private int pesoArchivo;

    public Audiolibros(int duracion, int pesoArchivo, String titulo, String autor, int anioPublicacion, int stock) {
        super(titulo, autor, anioPublicacion, stock);
        this.duracion=duracion;
        this.pesoArchivo=pesoArchivo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPesoArchivo() {
        return pesoArchivo;
    }

    public void setPesoArchivo(int pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }
}
