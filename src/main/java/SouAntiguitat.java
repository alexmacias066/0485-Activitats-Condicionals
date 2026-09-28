
import java.util.Scanner;

// Activitat 15 — Sou i antiguitat
public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
        //   Mostra el sou a pagar
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quin és el teu sou: ");
        double sou = teclat.nextDouble();
        System.out.println("Digues els teus anys a l'empresa: ");
        int antiguitat = teclat.nextInt();

        if(sou < 500 && antiguitat>=10)
        {
            double antiguitat10 = sou + (sou*0.2);
            System.out.println("Rebs un augment del 20%, el teu sou és: " + antiguitat10);
        }
        if(sou < 500 && antiguitat < 10)
        {
            double antiguitatNo10 = sou + (sou*0.05);
            System.out.println("Rebs un augment del 5%, el teu sou és: " + antiguitatNo10);
        }
        if (sou >= 500)
        {
            System.out.println("Malauradament no rebs ningun augment.");
        }
    }
}
