package practices.HerenciaPlantas;

public class Briofita extends PlantaSinSemilla {
    public Briofita(String nombre) {
        super(nombre, "Simple", "Rizoides");
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de su gametofito.");
    }

    public String obtenerClasificacion() {
        return "Briofita";
    }
}

class Pteridofita extends PlantaSinSemilla {
    public Pteridofita(String nombre) {
        super(nombre, "Frondas", "Raíces verdaderas");
    }

    @Override
    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus frondas.");
    }

    @Override
    public String obtenerClasificacion() {
        return "Pteridofita";
    }
}
