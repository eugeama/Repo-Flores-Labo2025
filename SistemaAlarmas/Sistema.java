package Edificios;
import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
    ArrayList<Edificio> edificios;
    Scanner sc = new Scanner(System.in);

    SensorTemperatura st1 = new SensorTemperatura();

    String[]=Alarmas = {"SensorPresion","SensorTemperatura","DetectorHumo"};
    System.out.println("Ingrese un numero entre 0 y 3: ");

    int opcion=0;

    if (opcion>=0 && opcion<=3) {
        System.out.println("Mostrando el dispositivo "+opcion);
    }
    else {

    }



    //esto estaba de antes en el ejercicio cuando hice el sistema
    public Sistema(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }


    public ArrayList<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {
        this.edificios = edificios;
    }

    public int recorreDHumo() {
        for (Edificio edificio : edificios) {
            for (DetectorHumo detector : edificio.detectoresHumo) {

            }
        }
        return;
        }
    }
}
