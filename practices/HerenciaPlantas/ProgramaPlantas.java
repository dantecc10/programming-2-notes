package practices.HerenciaPlantas;

public class ProgramaPlantas {
    public static void main(String[] args) {
        ClasificadorPlantas clasificador = new ClasificadorPlantas();

        clasificador.agregarPlanta(new Musgo("Musgo de turbera"));
        clasificador.agregarPlanta(new Helecho("Helecho águila"));
        clasificador.agregarPlanta(new Pino("Pino silvestre"));
        clasificador.agregarPlanta(new Maiz("Maíz dulce"));
        clasificador.agregarPlanta(new Rosal("Rosal silvestre"));

        System.out.println("Clasificación de plantas:");
        clasificador.mostrarClasificacion();

        System.out.println("\nProceso de fotosíntesis:");
        clasificador.realizarFotosintesis();

        System.out.println("\nProceso de floración:");
        clasificador.mostrarFloración();
    }
}