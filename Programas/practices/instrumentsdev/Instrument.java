package Programas.practices.instrumentsdev;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public abstract class Instrument {

    protected String name;
    protected String sound;

    public Instrument(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String tipoInstrumento(int type) {
        switch (type) {
            case 1:
                return "Percusión";
            case 2:
                return "Percusión y cuerdas";
            case 3:
                return "Cuerdas";
            case 4:
                return "Viento";
            default:
                return "No definido";
        }
    }

    public abstract void play() throws InterruptedException;

    public abstract String tipoInstrumento();

}
