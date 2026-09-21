// Activitat 11 — Intercanvi de dues variables

import java.util.Scanner;

public class Intercanvi {
    public static void main(String[] args) {
        // TODO: llegeix dos enters (a i b), intercanvia'ls fent servir una
        //       variable auxiliar i mostra'ls després de l'intercanvi:
        //   a = ...
        //   b = ...

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix el primer número: ");
        int a = teclat.nextInt();
        
        System.out.println("Introdueix el segon número: ");
        int b = teclat.nextInt();
        
        int temporal = a;
        a = b;
        b = temporal;

        System.out.println("El primer número és: " + a);
        System.out.println("El segon número és: " + b);


    }
}
