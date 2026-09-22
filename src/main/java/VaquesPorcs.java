
import java.util.Scanner;

// Activitat 03 — Vaques i porcs
public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el número de porcs: ");
        int porcs = teclat.nextInt();
        System.out.println("Introdueix el número de vaques: ");
        int vaques = teclat.nextInt();

        int total = vaques + porcs;
        System.out.println("El percentatge de vaques és: " + vaques*100/total + "%");
        System.out.println("El percentatge de porcs és: " + porcs*100/total + "%");
    }
}
