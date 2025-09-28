package MasterChef;

import java.time.LocalDate;

public class Intermedios extends Participante {
    private int stockIngred;
    private int cantIngred;

    public Intermedios(int stockIngred, int cantIngred, String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento) {
        super(localidad, color, nombre, apellido, dni, nacimiento);
        this.stockIngred=stockIngred;
        this.cantIngred=cantIngred;
    }

    public int getStockIngred() {
        return stockIngred;
    }

    public void setStockIngred(int stockIngred) {
        this.stockIngred = stockIngred;
    }

    public static int getCantIngred() {
        return 0;
    }

    public void setCantIngred(int cantIngred) {
        this.cantIngred = cantIngred;
    }

    public void mensaje() {
        if (stockIngred> 1) {
            System.out.println("Mi stock a utilizar es de " + cantIngred);
        }
    }

    @Override
    public void cocinarPlato(Plato plato) throws Exception {
        if (plato.getTipo() != Tipos.PRINCIPAL) {
            throw new Exception("El intermedio solo puede cocinar principales");
        }

        if (cantIngred > stockIngred) {
            throw new SinStock();
        } else {
            stockIngred -= cantIngred;
        }

        System.out.println("El intermedio cocinó el plato principal: " + plato.getNombre());
    }

    @Override
    public void servirPlato(Plato plato) throws Exception {
        if (plato.getTipo() != Tipos.PRINCIPAL) {
            throw new Exception("El intermedio solo puede servir principales");
        }

        System.out.println("El intermedio sirvió el plato principal: " + plato.getNombre());
    }
}
