package practices.HerenciaPlantas;

public abstract class Gimnosperma extends PlantaConSemilla {
    public Gimnosperma(String nombre, String tipoDeHoja) {
        super(nombre, tipoDeHoja, "Raíz pivotante");
    }
}

abstract class Angiosperma extends PlantaConSemilla {
    protected String tipoDeFlor;

    public Angiosperma(String nombre, String tipoDeHoja, String tipoDeFlor) {
        super(nombre, tipoDeHoja, "Raíz fibrosa o pivotante");
        this.tipoDeFlor = tipoDeFlor;
    }

    public abstract void producirFlor();
}