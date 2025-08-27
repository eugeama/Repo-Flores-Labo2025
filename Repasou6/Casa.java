package Repasou6;

public class Casa extends Vivienda {
    private double metrosCubiertos;
    private double metrosDescubiertos;
    public Casa(String direccion, Duenio duenio, double consumo,
                double metrosCubiertos, double metrosDescubiertos) {
        super(direccion, duenio, consumo);
        this.metrosCubiertos=metrosCubiertos;
        this.metrosDescubiertos=metrosDescubiertos;
    }

    public double superficieTotal(){
        return metrosCubiertos+metrosDescubiertos;
    }
    public void mostrarInfo(){
        System.out.println();
    }
}
