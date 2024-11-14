package examen2;

public class Animal {
    
    protected String especie;
    protected String nombre;

    // Constructor
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    // Metodos
    public void describir() {
        // Describe al animal
    }

    public void sonido() {
        // Simula el sonido del animal
    }

}
// -----| Clases hijas |-----
class Perro extends Animal {

    public Perro(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void describir() {
        System.out.println("""
            El perro es un mamífero doméstico de la familia de los cánidos,
            conocido por su lealtad y capacidad para convivir con el ser
            humano. Existen múltiples razas con gran variedad de tamaños,
            colores y temperamentos, siendo un compañero fiel y protector.
            """);
    }

    @Override
    public void sonido() {
        System.out.println("Wau, wau");
    }
    
}

class Delfin extends Animal {

    public Delfin(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void describir() {
        System.out.println("""
            El delfín es un mamífero marino inteligente,
            conocido por su sociabilidad, capacidad de
            comunicación y habilidades para realizar
            saltos y acrobacias en el agua.
            """);
    }

    @Override
    public void sonido() {
        System.out.println("Iiii, iiii");
    }
    
}

class Aguila extends Animal {

    public Aguila(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void describir() {
        System.out.println("""
            El águila es un ave rapaz de gran tamaño,
            caracterizada por su aguda visión, garras
            poderosas y su vuelo majestuoso en las
            alturas, símbolo de fuerza y libertad.
            """);
    }

    @Override
    public void sonido() {
        System.out.println("Kreee");
    }
    
}

class Vaca extends Animal {

    public Vaca(String nombre, String especie) {
        super(nombre, especie);
    }
    
    @Override
    public void describir() {
        System.out.println("""
            La vaca es un mamífero herbívoro doméstico,
            criado principalmente para la producción de
            leche, carne y cuero; destaca por su
            temperamento tranquilo y sociable.
            """);
    }

    @Override
    public void sonido() {
        System.out.println("Muuu");
    }

}
