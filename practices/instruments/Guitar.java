package practices.instruments;

public class Guitar extends Instrument {
    public String name;
    public String sound;

    public Guitar(String name, String sound) {
        super(name, sound);
        this.name = name;
        this.sound = sound;
    }

    public void play() {
        System.out.println("Playing the " + name);
        super.play();
    }
}
