package Biblioteca_Virtual;
import java.time.LocalDate;

public class Usuario extends Persona {
    private String mail;
    private Membresias tipoMembresia;

    public Usuario(String nombre, String apellido, int dni, LocalDate nacimiento,
                   LocalDate antiguedad, String mail, Membresias tipoMembresia) {
        super(nombre, apellido, dni, nacimiento, antiguedad);
        this.mail = mail;
        this.tipoMembresia=tipoMembresia;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public Membresias getTipoMembresia() {
        return tipoMembresia;
    }
    public void setTipoMembresia(Membresias tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
}