
import java.util.InputMismatchException;
import java.util.Scanner;

// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
        Scanner teclat = new Scanner(System.in);
       
        System.out.println("Introdueix dos números enters: ");
        int numero_1 = teclat.nextInt();
        int numero_2 = teclat.nextInt();
        
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplicació");
        System.out.println("[4] Divisió");
        System.out.println("Selecciona una opció.");
        int opcio = teclat.nextInt();

        switch (opcio) {
            case 1:
                try{
                    int suma = numero_1 + numero_2;
                    System.out.println("Suma = " + suma);
                }
                catch(InputMismatchException e){
                    System.out.println("ERROR número enter invàlid.");
                }
                break;
            case 2: 
                try {
                    int resta = numero_1 - numero_2;
                    System.out.println("Resta = " + resta);
                } catch (InputMismatchException e) {
                    System.out.println("ERROR número enter no vàlid.");
                }
                break;
            case 3:
                try{
                    int multiplicació = numero_1*numero_2;
                    System.out.println("Multiplicació = "+multiplicació);
                }
                catch(InputMismatchException e){
                    System.out.println("ERROR número enter no vàlid.");
                }
                break;
            case 4:
                try {
                    int divisió = numero_1/numero_2;
                    System.out.println("Divisió = "+divisió);
                } catch (InputMismatchException e) {
                    System.out.println("ERROR número enter no vàlid");
                }
                break;
            default:
                System.out.println("ERROR número imprevist");;
        }
    }
}
