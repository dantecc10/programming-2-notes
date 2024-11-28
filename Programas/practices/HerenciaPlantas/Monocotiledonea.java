package Programas.practices.HerenciaPlantas;

public class Monocotiledonea extends Angiosperma {
    public Monocotiledonea(String nombre, String tipoDeFlor) {
        super(nombre, "Paralela", tipoDeFlor);
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas con nervadura paralela.");
    }

    public String obtenerClasificacion() {
        return "Angiosperma - Monocotiledónea";
    }

    public void producirFlor() {
        System.out.println(nombre + " produce flores " + tipoDeFlor + " con pétalos en múltiplos de tres.");
    }
}

class Dicotiledonea extends Angiosperma {
    public Dicotiledonea(String nombre, String tipoDeFlor) {
        super(nombre, "Reticulada", tipoDeFlor);
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas con nervadura reticulada.");
    }

    public String obtenerClasificacion() {
        return "Angiosperma - Dicotiledónea";
    }

    public void producirFlor() {
        System.out.println(nombre + " produce flores " + tipoDeFlor + " con pétalos en múltiplos de cuatro o cinco.");
    }
}