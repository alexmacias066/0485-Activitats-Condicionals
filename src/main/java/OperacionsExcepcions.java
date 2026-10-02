
import java.util.InputMismatchException;
import java.util.Scanner;

// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
    try{
        Scanner teclat = new Scanner(System.in);
       
        System.out.println("Introdueix el primer número: ");
        int numero_1 = teclat.nextInt();
        System.out.println("Introdueix el segon número: ");
        int numero_2 = teclat.nextInt();

        int resultat;
        resultat = numero_1+numero_2;
        System.out.println(numero_1 +" + " +numero_2 +" = "+ resultat);
        resultat = numero_1 - numero_2;
        System.out.println(numero_1 +" - " +numero_2 +" = "+ resultat);
        resultat = numero_1 * numero_2;
        System.out.println(numero_1 +" X " +numero_2 +" = "+ resultat);
        if(numero_2!=0)
        {
            resultat = numero_1/numero_2;
            System.out.println(numero_1 +" / " +numero_2 +" = "+ resultat);
        }
    }
    catch(ArithmeticException e){
        System.out.println("ERROR en executar operació");
    }
    catch (InputMismatchException e)
    {
        System.out.println("ERROR en entrar dades");
    }
    }
}
