package PrestamosVirtuales;

import java.time.LocalDate;

public class Revista extends Publicacion implements Prestar {
    private String distribuidora;

    public Revista(String distribuidora, String titulo, String autor, int anioPublicacion, int stock) {
        super(titulo, autor, anioPublicacion, stock);
        this.distribuidora=distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public int multaPrestamo() {
        return 3500;
    }

    public void diasDevolucion(Prestamo prestamo){
        if (getAnioPublicacion() < 2020) {
            prestamo.setDevolucion(LocalDate.now().plusDays(10));
        }
        else {
            prestamo.setDevolucion(LocalDate.now().plusDays(3));
        }
    }
}
