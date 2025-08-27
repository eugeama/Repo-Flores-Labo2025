package Repasou6;

public class Departamento extends Vivienda {
    private int ambientes;

    public Departamento(String direccion, String codigoPostal, String tipoDeVivienda,
                        Duenio duenio, double consumo, int ambientes) {
        super(direccion, codigoPostal, tipoDeVivienda, duenio, consumo);
        this.ambientes = ambientes;
    }
        public int getAmbientes () {
            return ambientes;
        }
        public void setAmbientes (int ambientes){
            this.ambientes = ambientes;
        }

        public void mostrarInfo(){
            System.out.println();
        }
}