package Programas.practices.HerenciaPlantas;

public class EjemplosPlantas {
     
}

class Musgo extends Briofita {
    public Musgo(String nombre) {
        super(nombre);
    }
}

class Helecho extends Pteridofita {
    public Helecho(String nombre) {
        super(nombre);
    }
}

class Pino extends Conifera {
    public Pino(String nombre) {
        super(nombre);
    }
}

class Maiz extends Monocotiledonea {
    public Maiz(String nombre) {
        super(nombre, "unisexuales");
    }
}

class Rosal extends Dicotiledonea {
    public Rosal(String nombre) {
        super(nombre, "hermafroditas");
    }
}  
