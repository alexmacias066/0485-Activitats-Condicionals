
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
        int nuemro1 = teclat.nextInt();
        int numero2 = teclat.nextInt();
       
        int gran, petit;

        if(nuemro1 == numero2)
        {
            System.out.println("Els números han de ser diferents");
        }
        else{
            if(nuemro1>numero2)
            {
                gran = nuemro1;
                petit = numero2;
            }
            else
            {
                gran = numero2;
                petit = nuemro1;
            }
            if(petit != 0)
            {
                int resultat = gran/petit;
                System.out.println("El resultat és: "+ resultat);
            }
            else
            {
                System.out.println("El divisor no pot ser 0");
            }
        }
    }
}
