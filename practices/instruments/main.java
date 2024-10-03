
// Importar las clases anteriormente creadas
package practices.instruments;

public class main {
    public static void main(String[] args) {
        final String path = "/practices/instruments/sounds/";
        // Crear un objeto de la clase Guitar
        Instrument guitar = new Guitar("Guitar", "/sounds/acoustic-guitar.mp3");
        //Guitar guitar = new Guitar("Guitar", "sounds/acoustic-guitar.mp3");
        // Llamar al método play
        guitar.play();
    }
}
