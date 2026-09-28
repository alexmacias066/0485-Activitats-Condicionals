
import java.util.Scanner;

// Activitat 14 — Entre 1 i 10 i parell (if-else aniuada)
public class EntreU10Parell {
    public static void main(String[] args) {
        // TODO amb if-else aniuada: llegeix un número enter
        //   Digues si està entre 1 i 10 I, a més, si és parell
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        int numero = teclat.nextInt();

        if(numero <= 10)
        {
            System.out.println("El número està entre l'1 i el 10.");
            if(numero %2 == 0)
            {
                System.out.println("El número és par.");
            }
            else{
                System.out.println("El número es impar");
            }
        }
        else{
            System.out.println("El número no està entre l'1 i el 10");
            if(numero %2 == 0)
            {
                System.out.println("El número és par.");
            }
            else{
                System.out.println("El número es impar");
            }
        }
    }
}
