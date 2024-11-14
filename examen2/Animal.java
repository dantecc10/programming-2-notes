package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase Padre
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

    // Llena un arreglo con instancias de las clases hijas
    public static Animal[] crearArreglo() {

        Animal[] lista = new Animal[4];

        lista[0] = new Perro("Perro Schnauzer", "Canis lupus familiaris");
        lista[1] = new Delfin("Delfin", "Delphinus delphis");
        lista[2] = new Aguila("Aguila calva", "Haliaeetus leucocephalus");
        lista[3] = new Vaca("Vaca", "Bos taurus");

        return lista;
    }

    // Menu usado para mostrar los datos
    public static void menu() {

        Animal[] lista = crearArreglo();

        Scanner input = new Scanner(System.in);
        int opc = 0;

        System.out.print("""
            --------------| Animales |-------------
            Por favor elija una opcion para mostrar

            1.                                Perro
            2.                               Delfin
            3.                               Aguila
            4.                                 Vaca
            5.                                Salir
            """);

        boolean flag = false;
            
        // Verificacion de opciones
        while (opc != 5) {
            while(!flag) {
                try {

                    System.out.print("---------------------------------------\nOpcion: ");
                    opc = input.nextInt();
                    if (opc < 1 || opc > 5) {
                        throw new OutBoundsException();
                    }
                    flag = true;
                    
                } catch (InputMismatchException e) {
                    System.err.print("Opcion no numerica");
                } catch (OutBoundsException e) {
                    System.err.print(e.getMessage());
                } finally {
                    input.nextLine();
                    if (!flag) {
                        System.out.println(", intente de nuevo");
                    }
                }
            }

            // Impresion de lo solicitado
            System.out.println("");
            switch (opc) {
                case 1:
                    System.out.println("Descripcion:");
                    lista[0].describir();
                    System.out.println("Sonido caracteristico:");
                    lista[0].sonido();
                    break;
                case 2:
                    System.out.println("Descripcion:");
                    lista[1].describir();
                    System.out.println("Sonido caracteristico:");
                    lista[1].sonido();
                    break;
                case 3:
                    System.out.println("Descripcion:");
                    lista[2].describir();
                    System.out.println("Sonido caracteristico:");
                    lista[2].sonido();
                    break;
                case 4:
                    System.out.println("Descripcion:");
                    lista[3].describir();
                    System.out.println("Sonido caracteristico:");
                    lista[3].sonido();
                    break;
                case 5:
                    break;
            }

            // Asigna falso a la bandera usada al leer la opcion, para repetir el ciclo correctamente
            flag = false;
        }
        
    }

}
// --------------------| Clases hijas |--------------------
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
