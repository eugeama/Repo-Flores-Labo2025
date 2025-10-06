package PrestamosVirtuales;

import java.time.LocalDate;

public class Prestamo {
    private Prestar info;
    private int socioNum;
    private LocalDate inicioPrestamo;
    private LocalDate devolucion;

    public Prestamo(Prestar info, int socioNum, LocalDate inicioPrestamo, LocalDate devolucion) {
        this.info = info;
        this.socioNum = socioNum;
        this.inicioPrestamo = inicioPrestamo;
        this.devolucion = devolucion;
    }

    public Prestar getInfo() {
        return info;
    }

    public void setInfo(Prestar info) {
        this.info = info;
    }

    public int getSocioNum() {
        return socioNum;
    }

    public void setSocioNum(int socioNum) {
        this.socioNum = socioNum;
    }

    public LocalDate getInicioPrestamo() {
        return inicioPrestamo;
    }

    public void setInicioPrestamo(LocalDate inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }
}
