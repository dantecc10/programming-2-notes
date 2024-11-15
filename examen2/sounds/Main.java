package examen2.sounds;

public class Main {
    public static void main(String[] args) {
        AnimalSound lion;
        lion = new Lion("Lion", "");
        try {
            lion.playSound();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// What is the result?
// A. Compilation fails at Main.java.
// B. Compilation fails at Lion.java.
// C. The program prints "El Leon hace así 🎶..." and plays the sound file lion-roar.wav