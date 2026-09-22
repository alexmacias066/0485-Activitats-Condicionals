
import java.util.Scanner;

// Activitat 07 — Dividir el més gran entre el més petit
public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix 2 números diferents: ");
        double nuemro1 = teclat.nextDouble();
        double numero2 = teclat.nextDouble();
        if(nuemro1 == numero2)
        {
            System.out.println("Els números han de ser diferents");
        }
        else{
            double gran = Math.max(nuemro1, numero2);
            double petit = Math.min(nuemro1, numero2);
            if(petit == 0 )
            {
                System.out.println("El divisor no pot ser 0");
            }
            else
            {
                double resultat = gran/petit;
                System.out.println("El resultat és: " + resultat);
            }
        }
    }
}
