package PrestamosVirtuales;

import java.time.LocalDate;

public class Libro extends Publicacion implements Prestar {
    private boolean tieneSaga;

    public Libro(boolean tieneSaga, String titulo, String autor, int anioPublicacion, int stock) {
        super(titulo, autor, anioPublicacion, stock);
        this.tieneSaga=tieneSaga;
    }

    public boolean isTieneSaga() {
        return tieneSaga;
    }

    public void setTieneSaga(boolean tieneSaga) {
        this.tieneSaga = tieneSaga;
    }

    public int multaPrestamo() {
        return 7500;
    }

    public LocalDate darPrestamo() {
        return LocalDate.now().plusDays(15);
    }
}
