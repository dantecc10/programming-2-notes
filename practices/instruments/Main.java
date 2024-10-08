package practices.instruments;

public class Main {
    public static void main(String[] args) {
        final String path = "/practices/instruments/sounds/"; // Cambiar a ruta relativa
        Instrument guitar = new Guitar("Guitar", path + "acoustic-guitar.wav"); // Asegúrate de que la ruta sea correcta
        Instrument trumpet = new Trumpet("Trumpet", path + "trumpet.wav"); // Asegúrate de que la ruta sea correcta
        Instrument piano = new Piano("Piano", path + "soft-piano.wav"); // Asegúrate de que la ruta sea correcta
        try {
            guitar.play(); // Maneja la excepción de interrupción
            trumpet.play(); // Maneja la excepción de interrupción
            piano.play(); // Maneja la excepción de interrupción
        } catch (InterruptedException e) {
            System.err.println("Playback interrupted: " + e.getMessage());
        }
    }
}
