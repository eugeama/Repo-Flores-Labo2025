import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      
        ArrayList<String> gaseosas = new ArrayList<>();
        gaseosas.add("Coca");
        gaseosas.add("Sprite");
        BeneficioGaseosa bg1 = new BeneficioGaseosa("Promo Gaseosa", "Juan", "Descuento en gaseosas", true, gaseosas);

        ArrayList<String> comidas = new ArrayList<>();
        comidas.add("Hamburguesa");
        comidas.add("Papas");
        BeneficioComida bc1 = new BeneficioComida("Promo Comida", "Ana", "Descuento en comidas", true, comidas);

        ArrayList<String> tragos = new ArrayList<>();
        tragos.add("Mojito");
        tragos.add("Caipirinha");
        BeneficioTrago bt1 = new BeneficioTrago("Promo Trago", "Laura", "Descuento en tragos", tragos);

        HashMap<String,Integer> puntaje1 = new HashMap<>();
        puntaje1.put("rojo", 10);
        puntaje1.put("verde", 5);

        HashMap<String,Integer> puntaje2 = new HashMap<>();
        puntaje2.put("rojo", 8);
        puntaje2.put("amarillo", 6);
        puntaje2.put("verde", 3);

        HashMap<String,Integer> puntaje3 = new HashMap<>();
        puntaje3.put("rojo", 12);
        puntaje3.put("verde", 7);
        puntaje3.put("amarillo", 4);
        puntaje3.put("blanco", 1);

        DianaCircular dc = new DianaCircular("Diana Circular", 2, puntaje1, 13);
        DianaCuadrada dcu = new DianaCuadrada("Diana Cuadrada", 3, puntaje2, 5);
        DianaRectangular dr = new DianaRectangular("Diana Rectangular", 1, puntaje3, 4, 6);

        HashSet<Beneficio> benefsBar = new HashSet<>();
        HashSet<Beneficio> benefAcumBar = new HashSet<>();
        ArrayList<Diana> dianasBar = new ArrayList<>();
        Bar bar1 = new Bar("ArcoBar", dianasBar, 0, 0, benefsBar, benefAcumBar);

        bar1.agregarDiana(dc);
        bar1.agregarDiana(dcu);
        bar1.agregarDiana(dr);

        bar1.agregarBeneficio(bg1);
        bar1.agregarBeneficio(bc1);
        bar1.agregarBeneficio(bt1);

        bar1.registrarCliente(500);
        bar1.registrarCliente(600);

        System.out.println("Bar: " + bar1.getNombre());
        System.out.println("Cantidad de clientes: " + bar1.getCantClientes());
        System.out.println("Dinero recaudado: $" + bar1.getDineroRecaudado());
        System.out.println("Cantidad de beneficios de tragos: " + bar1.cantNoAcumulables());

        System.out.println("\nDianas del bar y sus áreas:");
        for(Diana d : bar1.getDianas()){
            System.out.println(d.getNombre() + " (" + d.getTipo() + ") - Área: " + d.calcularArea());
        }

        System.out.println("\nDiana con más puntajes en el bar: " + bar1.masPuntajes().getNombre());

        SistemaArcoFlecha sistema = new SistemaArcoFlecha();
        sistema.agregarBar(bar1);
        sistema.agregarDiana(dc);
        sistema.agregarDiana(dcu);
        sistema.agregarDiana(dr);
        sistema.agregarBeneficio(bg1);
        sistema.agregarBeneficio(bc1);
        sistema.agregarBeneficio(bt1);

        System.out.println("\nDiana con más puntajes en todo el sistema: " + sistema.dianaConMasPuntajes().getNombre());

        System.out.println("\nDescuento extra Gaseosa: $" + bg1.aplicarDescuentoExtra());
        System.out.println("Descuento extra Comida: $" + bc1.aplicarDescuentoExtra());
    }
}
