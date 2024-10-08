package practices.instrumentsdev;

public class Trumpet extends Instrument {

    public Trumpet(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void play() {
        System.out.println("Playing the " + getName());
        try {
            super.play(); // Llama al método play de Instrument
        } catch (InterruptedException e) {
            System.err.println("Playback interrupted: " + e.getMessage());
        }
    }
}
