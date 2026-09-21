// Activitat 10 — Hores, minuts i segons

import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: llegeix un nombre de segons i mostra:
        //   Hores: ...
        //   Minuts: ...
        //   Segons: ...

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix els segons: ");
        int segons = teclat.nextInt();

        int hores = segons / 3600;
        System.out.println("Hores: " + hores);
        segons = segons % 3600;

        int minuts = segons / 60;
        System.out.println("Minuts: " + minuts);
        segons = segons % 60;
        System.out.println("Segons: " + segons);
    }
}
