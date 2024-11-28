package Programas.practices.instrumentsdev;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Trumpet extends Instrument {

    public Trumpet(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void play() throws InterruptedException {
        System.out.println("Tipo de instrumento: " + tipoInstrumento(4));

        System.out.println("Playing the " + getName());
        try {
            URL soundUrl = getClass().getResource(sound);
            if (soundUrl == null) {
                System.err.println("Sound file not found: " + sound);
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundUrl);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    synchronized (clip) {
                        clip.notify();
                    }
                }
            });

            // Esperar hasta que se complete la reproducción
            synchronized (clip) {
                clip.start();
                clip.wait();
            }

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
