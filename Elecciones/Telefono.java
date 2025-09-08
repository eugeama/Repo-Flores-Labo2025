public abstract class Telefono extends Dispositivo implements Campania {
    private String comp_telefonica;
    private int numero;
    private String mensaje;

    public Telefono(int nroSerie, String fabricante, String modelo, String comp_telefonica,
                    int numero, String mensaje) {
        super(nroSerie, fabricante, modelo);
        this.comp_telefonica = comp_telefonica;
        this.numero=numero;
        this.mensaje=mensaje;
    }
    public enum COMPANIA {
        CLARO, PERSONAL, MOVISTAR, TUENTI
    }

    public String getComp_telefonica() {
        return comp_telefonica;
    }
    public void setComp_telefonica(String comp_telefonica) {
        this.comp_telefonica = comp_telefonica;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void enviarMensaje(String mensaje){
            System.out.println("Conectando con la antena más cercana: Voté por el partido para un mejor futuro");
        }
}
