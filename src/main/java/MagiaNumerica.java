
import java.util.Scanner;

// Activitat 03 — Màgia numèrica
public class MagiaNumerica {
    public static void main(String[] args) {
        // TODO: llegeix un número del teclat; multiplica'l per 3, suma-li 6,
        //       divideix entre 3 i resta-li el número inicial. Mostra el resultat:
        //   El resultat és 2

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introudeix un número: ");
        
        int num1 = 0;
        num1 = teclat.nextInt();
        int num2;
        num2 = ((((num1 * 3)+ 6) / 3) - num1);
        
        System.out.println("El resultat es: " + num2);
        
    
    }
}
