
import java.util.Scanner;


public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 10000;
        System.out.println("El saldo actual és: " + saldo + " euros.");
        
        System.out.println("Introdueix la quantitat a retirar: ");
        double quantitat = scanner.nextDouble();

        System.out.println("Fas servir un caixer propi? (S/N): ");
        char caixerPropi = scanner.next().charAt(0);

        double comissio = 0.0;
        if (caixerPropi == 'N' || caixerPropi =='n') {
            comissio = quantitat * 0.05;
        }
        if ((quantitat + comissio) > saldo) {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
        } else {
            double saldoRestant = saldo - (quantitat + comissio);
            System.out.println("Quantitat a treure: " + quantitat);
            System.out.println("Comissió aplicada: " + comissio);
            System.out.println("Saldo restant: " + saldoRestant);
        }
    }
}
