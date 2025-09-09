import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PalomaMsj pm1= new PalomaMsj("gris", "ala_larga", "rapida", false);
        PalomaMsj pm2= new PalomaMsj("blanca", "torcaza", "mensajito", true);

        Telefono tm1= new Telefono(301, "celuPro", "clave2025", Compania.MOVISTAR, 300111, true, 15);
        Telefono tm2= new Telefono(302, "smartMovil", "pass2025", Compania.TUENTI, 300222, false, 10);
        Telefono tm3= new Telefono(303, "miniPhone", "secure2025", Compania.CLARO, 300333, true, 5);

        Trabajador t1= new Trabajador("juan", "lopez", 123456, LocalDate.of(1998, 7, 21), 4567, 25000, "avenida siempreviva", LocalTime.of(9, 30));
        Trabajador t2= new Trabajador("maria", "gomez", 654321, LocalDate.of(1995, 11, 10), 7890, 28000, "calle falsa 123", LocalTime.now());

        HashSet<Mensajero>mensajero1= new HashSet<>();
        mensajero1.add(pm1);
        mensajero1.add(tm1);
        mensajero1.add(t1);

        Partido p1= new Partido("campania2025", "oficina central", 55, mensajero1);

        p1.agregarMensajero(pm2);
        p1.agregarMensajero(tm2);
        p1.agregarMensajero(tm3);
        p1.agregarMensajero(t2);

        p1.hacerCampania();
    }
}

