
import java.util.Scanner;

// Activitat 08 — Positiu, negatiu o zero
public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número enter: ");
        int numero = teclat.nextInt();

        if(numero > 0)
        {
            System.out.println("El número és positiu");
        }
        else{
            if(numero == 0)
            {
                System.out.println("El número és 0");
            }
            else{
                if(numero < 0)
                {
                    System.out.println("El número és negatiu");
                }
            }
        }
    }
}
