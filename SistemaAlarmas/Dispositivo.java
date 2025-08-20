package Edificios;

import Autos.Fecha;

public abstract class Dispositivo {
    private Boolean estado;
    private int medida;
    private int umbralInicial;
    private Fecha anioAdquisicion;


    public Dispositivo(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio){
        this.estado=estado;
        this.medida=medida;
        this.umbralInicial=umbralInicial;
        this.anioAdquisicion= new Fecha(dia, mes, anio);
    }

    public Dispositivo(){
        this.estado=true;
        this.medida=3;
        this.umbralInicial=5;
        this.anioAdquisicion= new Fecha(1, 6, 2000);
    }


    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(int umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public Fecha getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(Fecha anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public void recorrer() {
        if (this.getMedida() > this.getUmbralInicial()) {
            disparaAlarma();
        }
    }

    public void disparaAlarma(){
        System.out.println("");
    }
}
