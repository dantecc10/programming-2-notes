package practices.instruments;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Define una clase abstracta que se llame Instrumento
public abstract class Instrument {

    protected String name;
    protected String sound;

    // Puedes agregar métodos y propiedades comunes aquí
    public Instrument(String name, String sound) {
        this.name = name;
    }

    public void play() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(sound));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

public class Guitar extends Instrument {

    public Guitar() {
        super("Guitar", "/media/darkseid/DATA1/Repos/programming-2-notes/practices/instruments/");
    }

    // Puedes agregar métodos y propiedades específicas aquí
}