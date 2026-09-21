
import java.util.Scanner;

// Activitat 02 — Parell o senar
public class ParellSenar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és parell o senar
        //   Recorda: numero % 2 == 0 -> parell

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número enter: ");
        int numero = teclat.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println("Es parell");
        }
        else{
            System.out.println("Es senar");
        }
    }
}
