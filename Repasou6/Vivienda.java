package Repasou6;

public abstract class Vivienda {
    private String direccion;
    private String codigoPostal;
    private String tipoDeVivienda;
    private Duenio duenio;
    private double consumo;

    public Vivienda(String direccion, String codigoPostal, String tipoDeVivienda,
                    Duenio duenio, double consumo) {
        this.direccion = direccion;
        this.codigoPostal=codigoPostal;
        this.tipoDeVivienda=tipoDeVivienda;
        this.duenio=duenio;
        this.consumo=consumo;
    }

    public Vivienda(String direccion, Duenio duenio, double consumo) {
    }

    public abstract void mostrarInfo();

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoDeVivienda() {
        return tipoDeVivienda;
    }

    public void setTipoDeVivienda(String tipoDeVivienda) {
        this.tipoDeVivienda = tipoDeVivienda;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}

