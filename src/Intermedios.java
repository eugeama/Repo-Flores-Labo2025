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

    public int getCantIngred() {
        return cantIngred;
    }

    public void setCantIngred(int cantIngred) {
        this.cantIngred = cantIngred;
    }

    public void mensaje() {
        if (stockIngred> 1) {
            System.out.println("Mi stock a utilizar es de " + cantIngred);
        }
    }
    public void cocinarPlato(){
        if (cantIngred > stockIngred){
            //excepcion
        }
    }
}
