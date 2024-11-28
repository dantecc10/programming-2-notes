package Programas.practices.HerenciaPlantas;

public class Conifera extends Gimnosperma {
    public Conifera(String nombre) {
        super(nombre, "Acicular");
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas aciculares.");
    }

    public String obtenerClasificacion() {
        return "Gimnosperma - Conifera";
    }
}

class Cicada extends Gimnosperma {
    public Cicada(String nombre) {
        super(nombre, "Pinnada");
    }

    public void fotosintesis() {
        System.out.println(nombre + " realiza fotosíntesis a través de sus hojas pinnadas.");
    }

    public String obtenerClasificacion() {
        return "Gimnosperma - Cicada";
    }
}