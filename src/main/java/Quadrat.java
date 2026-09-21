// Activitat 04 — Perímetre i àrea d'un quadrat

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat (enter) i mostra:
        //   Perímetre del quadrat = ...      (costat x 4)
        //   Àrea del quadrat = ...           (costat x costat)

        System.out.println("Introdueix el costat del quadrat: ");
        Scanner teclat = new Scanner(System.in);
        int costat = 0;
        costat = teclat.nextInt();
        
        int perimetre;
        int area;
        
        perimetre = costat * 4;
        area = costat * costat;
        
        System.out.println("El teu perímetre és: " + perimetre);
        System.out.println("La teva àrea és: " + area);
    }
}
