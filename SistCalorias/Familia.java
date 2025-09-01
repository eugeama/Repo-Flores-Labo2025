package SistCalorias;

import java.util.HashSet;

public class Familia {
    public HashSet<Persona> personas;

    public Familia(HashSet<Persona>personas){
        this.personas=personas;
    }
    public Familia(){
        this.personas=new HashSet<>();
    }

    public HashSet<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(HashSet<Persona>personas){
        this.personas=personas;
    }
      public double promCalorias (){
        int calorias=0;
        for (Map.Entry<Persona>entry: personas.entrySet()){
            calorias=familia.getCalorias();
        }
        return calorias/familias.size();
    }
}

