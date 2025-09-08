
public abstract class PalomaMsj extends Aves implements Campania {
    private boolean puedeVolar;
    private String mensaje;
    public PalomaMsj(String nombre, String color, String especie, boolean puedeVolar, String mensaje) {
        super(nombre, color, especie);
        this.puedeVolar=puedeVolar;
        this.mensaje=mensaje;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviarMensaje(String mensaje){
        if (puedeVolar) {
            System.out.println("Lanzando un papelito que dice: Voté por el partido para un mejor futuro");
        }
        else {
                System.out.println(getNombre() + "no puede enviar mensaje");
            }
        }
}
