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
            int monedes_200 = centims / 200;
            centims = centims % 200;
            if (monedes_200 > 0) {
                System.out.println(monedes_200 + " moneda/es de 200 cèntims");
            }

            int monedes_100 = centims / 100;
            centims = centims % 100;
            if (monedes_100 > 0) {
                System.out.println(monedes_100 + " moneda/es de 100 cèntims");
            }

            int monedes_50 = centims / 50;
            centims = centims % 50;
            if (monedes_50 > 0) {
                System.out.println(monedes_50 + " moneda/es de 50 cèntims");
            }

            int monedes_20 = centims / 20;
            centims = centims % 20;
            if (monedes_20 > 0) {
                System.out.println(monedes_20 + " moneda/es de 20 cèntims");
            }

            int monedes_10 = centims / 10;
            centims = centims % 10;
            if (monedes_10 > 0) {
                System.out.println(monedes_10 + " moneda/es de 10 cèntims");
            }

            int monedes_5 = centims / 5;
            centims = centims % 5;
            if (monedes_5 > 0) {
                System.out.println(monedes_5 + " moneda/es de 5 cèntims");
            }

            int monedes_2 = centims / 2;
            centims = centims % 2;
            if (monedes_2 > 0) {
                System.out.println(monedes_2 + " moneda/es de 2 cèntims");
            }

            int monedes_1 = centims;
            if (monedes_1 > 0) {
                System.out.println(monedes_1 + " moneda/es de 1 cèntim");
            }
        }
    }
}
