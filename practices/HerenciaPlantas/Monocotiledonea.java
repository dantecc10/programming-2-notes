package practices.HerenciaPlantas;

public class Monocotiledonea extends Angiosperma {
    public Monocotiledonea(String nombre, String tipoDeFlor) {
        super(nombre, "Paralela", tipoDeFlor);
    }

    @Override
    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas con nervadura paralela.");
    }

    @Override
    public String obtenerClasificacion() {
        return "Angiosperma - Monocotiledónea";
    }

    @Override
    public void producirFlor() {
        System.out.println(nombre + " produce flores " + tipoDeFlor + " con pétalos en múltiplos de tres.");
    }
}

class Dicotiledonea extends Angiosperma {
    public Dicotiledonea(String nombre, String tipoDeFlor) {
        super(nombre, "Reticulada", tipoDeFlor);
    }

    @Override
    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas con nervadura reticulada.");
    }

    @Override
    public String obtenerClasificacion() {
        return "Angiosperma - Dicotiledónea";
    }

    @Override
    public void producirFlor() {
        System.out.println(nombre + " produce flores " + tipoDeFlor + " con pétalos en múltiplos de cuatro o cinco.");
    }
}