package practices.HerenciaPlantas;

import java.util.ArrayList;
import java.util.List;

public class ClasificadorPlantas {
    private List<Plantas> plantas;

    public ClasificadorPlantas() {
        plantas = new ArrayList<>();
    }

    public void agregarPlanta(Plantas planta) {
        plantas.add(planta);
    }

    public void mostrarClasificacion() {
        for (Plantas planta : plantas) {
            System.out.println(planta.getNombre() + " - Clasificación: " + planta.obtenerClasificacion());
        }
    }

    public void realizarFotosintesis() {
        for (Plantas planta : plantas) {
            planta.fotosintesis();
        }
    }

    public void mostrarFloración() {
        for (Plantas planta : plantas) {
            if (planta instanceof Angiosperma) {
                ((Angiosperma) planta).producirFlor();
            } else {
                System.out.println(planta.getNombre() + " no produce flores.");
            }
        }
    }
}