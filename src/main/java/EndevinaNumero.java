// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)
import java.util.Random;
import java.util.Scanner;
public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era
        Random generador = new Random();
        int numero_a_endevinar = generador.nextInt(1,10);

        Scanner teclat = new Scanner(System.in);
        System.out.println("Endivina el número: ");
        int numero_endevinat = teclat.nextInt();

        if(numero_endevinat == numero_a_endevinar)
        {
            System.out.println("Enhorabona, has encertat, el número és: " + numero_a_endevinar);
        }
        else
        {
            System.out.println("Ho sento, has fallat, el númeor era: " + numero_a_endevinar);
        }

    }
}
