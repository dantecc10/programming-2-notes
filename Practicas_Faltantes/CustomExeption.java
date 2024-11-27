package Practicas_Faltantes;

public class CustomExeption extends Exception {
    
    public static class NegativeIntInput extends CustomExeption {

        public NegativeIntInput() {
            super();
        }

        public static void launchException(int value) throws NegativeIntInput {
            if (value <= 0) {
                throw new NegativeIntInput();
            }
        }

    }

}
