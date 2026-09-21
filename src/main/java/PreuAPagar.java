
import java.util.Scanner;

// Activitat 09 — Preu a pagar amb descompte
// Nota: els decimals s'escriuen amb punt (4.5), no amb coma.
public class PreuAPagar {
    public static void main(String[] args) {
        // TODO: llegeix les unitats (enter), el preu unitari (real) i el
        //       descompte en % (real), i mostra:
        //   El valor a pagar serà: ... euros

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Unitats comprades: ");
        Double unitatsComprades = teclat.nextDouble();
       
        System.out.println("Preu unitats: ");
        Double preuUnitari = teclat.nextDouble();
        
        System.out.println("Introdueix el descompte: ");
        Double descompte = teclat.nextDouble();

        Double preufinal = unitatsComprades * preuUnitari;
        Double preudescompte = preufinal * descompte/100;
        Double preutotal = preufinal - preudescompte;
        
        System.out.println("El preu a pagar es: " + preutotal);
    }
}
