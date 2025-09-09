import java.util.ArrayList;

public class Sistema {
    private ArrayList<Bar> bares;
    private ArrayList<Diana> dianas;
    private ArrayList<Beneficio> beneficios;

    public Sistema() {
        bares = new ArrayList<>();
        dianas = new ArrayList<>();
        beneficios = new ArrayList<>();
    }

    public void agregarBar(Bar b) {
        bares.add(b);
    }

    public void agregarDiana(Diana d) {
        dianas.add(d);
    }

    public void agregarBeneficio(Beneficio b) {
        beneficios.add(b);
    }

    public Diana dianaConMasPuntajesDistintos() {
        if (dianas.isEmpty()) {
            return null;
        }

        Diana mejorDiana = dianas.get(0);
        for (Diana d : dianas) {
            if (d.getPuntaje().size() > mejorDiana.getPuntaje().size()) {
                mejorDiana = d;
            }
        }
        return mejorDiana;
    }

    public ArrayList<Bar> getBares() {
        return bares;
    }

    public ArrayList<Diana> getDianas() {
        return dianas;
    }

    public ArrayList<Beneficio> getBeneficios() {
        return beneficios;
    }
}
