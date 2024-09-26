package practices.cafe7;

import java.util.Scanner;

public class CafeInternet {
    public static void main(String args[]) {

        Scanner entry = new Scanner(System.in);
    
        System.out.print("Nombre: ");;
        String name = entry.nextLine();
        System.out.print("Número de maquina: ");
        int num = entry.nextInt();
        System.out.print("Hora entrada: ");
        int hour = entry.nextInt();
        System.out.print("Minuto entrada: ");
        int min = entry.nextInt();

        Datos pc = new Datos(name, num, hour, min);

        System.out.print("Agregar minutos: ");
        int inc = entry.nextInt();
        pc.incrementaTiempo(inc, 0);

        System.out.print("He: "+pc.getHoraEntrada()+" Hs: "+pc.getHoraSalida());

        pc.calculaPago();

        System.out.println("Precio final: " + pc.getPagoTotal());

        entry.close();
    }
}