// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix una quantiat de cèntims: ");
        int centims = teclat.nextInt();
       
        if (centims < 0) {
            System.out.println("La quantitat ha de ser igual o major que 0.");
        } else {
            int m200 = centims / 200;
            centims = centims % 200;
            if (m200 > 0) {
                System.out.println(m200 + " moneda/es de 200 cèntims");
            }

            int m100 = centims / 100;
            centims = centims % 100;
            if (m100 > 0) {
                System.out.println(m100 + " moneda/es de 100 cèntims");
            }

            int m50 = centims / 50;
            centims = centims % 50;
            if (m50 > 0) {
                System.out.println(m50 + " moneda/es de 50 cèntims");
            }

            int m20 = centims / 20;
            centims = centims % 20;
            if (m20 > 0) {
                System.out.println(m20 + " moneda/es de 20 cèntims");
            }

            int m10 = centims / 10;
            centims = centims % 10;
            if (m10 > 0) {
                System.out.println(m10 + " moneda/es de 10 cèntims");
            }

            int m5 = centims / 5;
            centims = centims % 5;
            if (m5 > 0) {
                System.out.println(m5 + " moneda/es de 5 cèntims");
            }

            int m2 = centims / 2;
            centims = centims % 2;
            if (m2 > 0) {
                System.out.println(m2 + " moneda/es de 2 cèntims");
            }

            int m1 = centims;
            if (m1 > 0) {
                System.out.println(m1 + " moneda/es de 1 cèntim");
            }
        }
    }
}
