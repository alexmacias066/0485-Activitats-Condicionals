
import java.util.Scanner;

// Activitat 05 — Operacions aritmètiques fonamentals
public class OperacionsMatematiques {
    public static void main(String[] args) {
        // TODO: llegeix dos enters i mostra suma, resta, producte i divisió:
        //   4 + 2 = 6
        //   4 - 2 = 2
        //   4 * 2 = 8
        //   4 / 2 = 2

        try {
            Scanner teclat = new Scanner(System.in);
            
            System.out.println("Introudeix un número: ");
            int numero = teclat.nextInt();
            System.out.println("Introudeix un altre número: ");
            int numero_2 = teclat.nextInt();
            
            int suma = numero + numero_2;
            int resta = numero - numero_2;
            int producte = numero * numero_2;
            int divisio = numero / numero_2;

            System.out.println(numero + " + " + numero_2 + " = " + suma);
            System.out.println(numero + " - " + numero_2 + " = " + resta);
            System.out.println(numero + " x " + numero_2 + " = " + producte);
            System.out.println(numero + " / " + numero_2 + " = " + divisio);
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
}
