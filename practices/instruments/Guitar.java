package practices.instruments;

public class Guitar extends Instrument {

    public Guitar(String name, String sound) {
        super(name, sound);
    }

    public void play() {
        System.out.println("Playing the " + name);
        super.play();
    }
}
