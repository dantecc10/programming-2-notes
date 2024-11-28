package examen2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoundPlayer {

    public static void main(String[] args) throws InputMismatchException, OutBoundsException {
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.menu();
    }

    public static void play(Integer animal) {
        AnimalSound someAnimalSound = null;
        switch (animal) {
            case 1:
                someAnimalSound = new Dog("Dog", "");
                break;
            case 2:
                someAnimalSound = new Dolphin("Dolphin", "");
                break;
            case 3:
                someAnimalSound = new Eagle("Eagle", "");
                break;
            case 4:
                someAnimalSound = new Cow("Cow", "");
                break;
            case 5:
                someAnimalSound = new Cat("Cat", "");
                break;
            case 6:
                someAnimalSound = new Lion("León", "");
                break;
            default:
                System.out.println("Ha ocurrido un error");
        }

        try {
            someAnimalSound.playSound();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void menu() throws InputMismatchException, OutBoundsException {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n----| MENÚ SONIDOS DE ANIMALES |----");
            System.out.println("1. Perro");
            System.out.println("2. Delfín");
            System.out.println("3. Águila");
            System.out.println("4. Vaca");
            System.out.println("5. Gato");
            System.out.println("6. León");
            System.out.println("7. Salir");

            option = Input.verifyOpc(1, 5, "------------------------------------");

            switch (option) {
                case 7:
                    System.out.println("¡Gracias por usar el reproductor!");
                    break;
                default:
                    play(option);
            }
        } while (option != 7);
    }
}