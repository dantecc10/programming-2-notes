package practices.HerenciaPlantas;

public abstract class Plantas {
    protected String nombre;
    protected String tipoDeHoja;
    protected String tipoDeRaiz;

    public Plantas(String nombre, String tipoDeHoja, String tipoDeRaiz) {
        this.nombre = nombre;
        this.tipoDeHoja = tipoDeHoja;
        this.tipoDeRaiz = tipoDeRaiz;
    }

    public abstract void fotosintesis();
    public abstract String obtenerClasificacion();

    public String getNombre() {
        return nombre;
    }
}

abstract class PlantaSinSemilla extends Plantas {
    public PlantaSinSemilla(String nombre, String tipoDeHoja, String tipoDeRaiz) {
        super(nombre, tipoDeHoja, tipoDeRaiz);
    }
}

abstract class PlantaConSemilla extends Plantas {
    public PlantaConSemilla(String nombre, String tipoDeHoja, String tipoDeRaiz) {
        super(nombre, tipoDeHoja, tipoDeRaiz);
    }
}