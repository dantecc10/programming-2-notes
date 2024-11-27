package Practicas_Faltantes;

public class Clean {
    
    public static void console() {

        try {

            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
