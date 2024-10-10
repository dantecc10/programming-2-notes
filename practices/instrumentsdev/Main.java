package practices.instrumentsdev;

public class Main { 
    public static void main(String[] args) {
        final String path = "/practices/instrumentsdev/sounds/"; // Cambiar a ruta relativa
        Instrument instruments[];
        instruments = new Instrument[3];
        instruments[0] = new Guitar("Guitar", path + "acoustic-guitar.wav"); // Asegúrate de que la ruta sea correcta
        instruments[1] = new Trumpet("Trumpet", path + "trumpet.wav"); // Asegúrate de que la ruta sea correcta
        instruments[2] = new Piano("Piano", path + "soft-piano.wav"); // Asegúrate de que la ruta sea correcta
        int option = 0;
        while (option != 5) {
            // Escribir y leer un menú
            System.out.println("Menú de Instrumentos");
            System.out.println("1. Guitar");
            System.out.println("2. Trumpet");
            System.out.println("3. Piano");
            System.out.println("4. Reproducir todos los instrumentos");
            System.out.println("5. Salir");

            // Leer la opción del usuario
            while (option == 0) {
                try {
                    option = Integer.parseInt(System.console().readLine());
                } catch (NumberFormatException e) {
                    System.err.println("Opción inválida: " + e.getMessage());
                }
            }

            // Reproducir el instrumento seleccionado
            switch (option) {
                case 4:
                    try {
                        for (Instrument instrument : instruments) {
                            instrument.play(); // Maneja la excepción de interrupción
                        }
                    } catch (InterruptedException e) {
                        System.err.println("Reproducción interrumpida: " + e.getMessage());
                    }
                    option = 0;
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    // Ver el tamaño del arreglo de instrumentos
                    if (option <= instruments.length) {
                        try {
                            instruments[option - 1].play();
                        } catch (InterruptedException e) {
                            System.err.println("Reproducción interrumpida: " + e.getMessage());
                        }
                    } else {
                        System.err.println("Opción inválida");
                    }
                    option = 0;
                    break;
            }
        }
    }
}