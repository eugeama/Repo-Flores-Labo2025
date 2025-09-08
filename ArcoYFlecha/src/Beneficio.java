public class Beneficio {
    private String nombre;
    private String creador;
    private String desc;
    private boolean acumulable;

    public Beneficio(String nombre,String creador, String desc, boolean acumulable) {
        this.nombre=nombre;
        this.creador=creador;
        this.desc = desc;
        this.acumulable=acumulable;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public boolean isAcumulable() {
        return acumulable;
    }
    public void setAcumulable(boolean acumulable) {
        this.acumulable = acumulable;
    }

}
