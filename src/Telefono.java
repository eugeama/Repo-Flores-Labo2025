public abstract class Telefono extends Dispositivo implements Campania {
    private String comp_telefonica;
    private int numero;

    public Telefono(int nroSerie, String fabricante, String modelo, String comp_telefonica, int numero) {
        super(nroSerie, fabricante, modelo);
        this.comp_telefonica = comp_telefonica;
        this.numero=numero;
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
}
