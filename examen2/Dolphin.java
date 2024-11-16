package examen2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Dolphin extends AnimalSound {

    public Dolphin(String name, String sound) {
        super("Delfín", "/examen2/files/dolphin-sound.wav");
    }

    public void playSound() throws InterruptedException {
        System.out.println("El delfín hace así 🎶...");
        try {
            URL url = getClass().getResource(sound);

            if (url == null) {
                System.err.println("Sound file not found: " + sound);
                return;
            }

            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();

            clip.addLineListener((LineEvent event) -> {
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

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error al reproducir el sonido");
            e.printStackTrace();
        }
    }
}