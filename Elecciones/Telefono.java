public abstract class Telefono extends Dispositivo implements Campania {
    private String comp_telefonica;
    private int numero;
    private String mensaje;
    private boolean prendido;
    private int credito;

    public Telefono(int nroSerie, String fabricante, String modelo, String comp_telefonica,
                    int numero, String mensaje, private boolean prendido, private int credito) {
        super(nroSerie, fabricante, modelo);
        this.comp_telefonica = comp_telefonica;
        this.numero=numero;
        this.mensaje=mensaje;
        this.prendido=prendido;
        this.credito= credito;
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
    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public void enviarMensaje(String mensaje){
           String respuesta= "";
        if(prendido || credito>0){
            respuesta= "Conectando con antena más cercana... ";
        }
        return respuesta;
    }
}
