
import java.util.Scanner;

// Activitat 12 — Monedes mínimes
public class MonedesMinimes {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims i mostra quantes monedes de
        //       cada tipus calen (200, 100, 50, 20, 10, 5, 2, 1), una per línia.
        //       Per a l'entrada 123:
        //   0 monedes de 2 euros
        //   1 monedes d'1 euro
        //   0 monedes de 50 cèntims
        //   1 monedes de 20 cèntims
        //   0 monedes de 10 cèntims
        //   0 monedes de 5 cèntims
        //   1 moneda de 2 cèntims
        //   1 moneda de 1 cèntims

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix els cèntims: ");
        int centims = teclat.nextInt();

        int euros2 = centims/200;
        System.out.println(euros2 + " monedes de 2 euros");
        centims = centims % 200;

        int eruos1 = centims/100;
        System.out.println(eruos1 + " monedes d'1 euro");
        centims = centims % 100;

        int centims50 = centims/50;
        System.out.println(centims50 + " monedes de 50 cèntims");
        centims = centims % 50;

        int centims20 = centims / 20;
        System.out.println(centims20 + " monedes de 20 cèntims");
        centims = centims % 20;

        int cenitms10 = centims/10;
        System.out.println(cenitms10 + " monedes de 10 cèntims");
        centims = centims % 10;

        int centims5 = centims/5;
        System.out.println(centims5 + " monedes de 5 cèntims");
        centims = centims % 5;

        int centims2 = centims / 2;
        System.out.println(centims2 + " monedes de 2 cèntims");
        centims = centims % 2;

        int centims1 = centims/1;
        System.out.println(centims1 + " monedes d'1 cèntims");
    }
}