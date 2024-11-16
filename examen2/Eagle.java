package examen2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Eagle extends AnimalSound {

    public Eagle(String name, String sound) {
        super("Águila", "/examen2/files/eagle-scream.wav");
    }

    public void playSound() throws InterruptedException {
        System.out.println("El águila hace así 🎶...");
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

        } eaglech (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error al reproducir el sonido");
            e.printStackTrace();
        }
    }
}