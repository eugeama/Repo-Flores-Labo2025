package PrestamosVirtuales;

import java.time.LocalDate;

public interface Prestar {
    int multaPrestamo();
    LocalDate darPrestamo();
    String mensajePrestamo();
    boolean extenderPrestamo() throws ExtenderPrestamoException;
}

