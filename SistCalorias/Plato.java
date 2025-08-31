package SistCalorias;
import java.util.HashSet;

public class Plato {
 private String nombre;
 private HashSet<Ingredientes> ingredientes;
 private int calorias;

 public Plato(String nombre, HashSet<Ingredientes> ingredientes, int calorias) {
  this.nombre = nombre;
  this.ingredientes = ingredientes;
  this.calorias = calorias;
 }

   public Plato() {
    this.nombre = "Plato";
    this.ingredientes = new HashSet<>();
    this.calorias = 0;
   }

   public String getNombre() {
    return nombre;
   }
   public void setNombre(String nombre) {
    this.nombre = nombre;
   }
   public HashSet<Ingredientes> getIngredientes() {
    return ingredientes;
   }
   public void setIngredientes(HashSet<Ingredientes> ingredientes) {
    this.ingredientes = ingredientes;
   }
   public int getCalorias() {
    return calorias;
   }
   public void setCalorias(int calorias) {
    this.calorias = calorias;
   }
}