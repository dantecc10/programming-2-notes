import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);

    System.out.print("Dame el primer número: ");
    int num1 = ent.nextInt();

    System.out.print("Dame el segundo número: ");
    int num2 = ent.nextInt();

    if (num1%num2 == 0) {
        System.out.println(num1+ " es divisible entre " +num2);
    } else {
        System.out.println(num1+ " no es divisible entre " +num2);
    }

    ent.close();
    }
}