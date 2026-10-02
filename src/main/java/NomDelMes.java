// Activitat 22 — Nom del mes (switch)

import java.util.Scanner;

public class NomDelMes {
    public static void main(String[] args) {
        // TODO amb switch: llegeix un número de mes (1-12) i mostra el seu nom
        //   Controla els números fora de rang (default)
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número de mes [1-12]: ");
        int numero_mes = teclat.nextInt();
        switch (numero_mes) {
            case 1:
                System.out.println("Gener");
                break;
            case 2:
                System.out.println("Febrer");
                break;
            case 3:
                System.out.println("Març");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maig");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("Juliol");
                break;
            case 8:
                System.out.println("Agost");
                break;
            case 9:
                System.out.println("Setembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Desembre");
                break;
            default:
                System.out.println("Número no vàlid.");;
        }

    }
}
