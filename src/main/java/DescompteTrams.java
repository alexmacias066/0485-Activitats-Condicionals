
import java.util.Scanner;

// Activitat 16 — Descompte per trams
public class DescompteTrams {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat N i resta-li el descompte segons el tram
        //   N < 500          -> 5%
        //   500 <= N < 1000  -> 8%
        //   1000 <= N <= 5000 -> 15%
        //   N > 5000         -> 25%
        //   Mostra el resultat
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix una quantitat: ");
        int quantitat = teclat.nextInt();

        if(quantitat < 500)
        {
            double descompte1 = quantitat - (quantitat * 0.05);
            System.out.println("Has rebut un descompte del 5%: " + descompte1);
        }
        else if(500<= quantitat && quantitat < 1000)
        {
            double descompte2 = quantitat - (quantitat * 0.08);
            System.out.println("Has rebut un descompte del 8%: " + descompte2);
        }
        else if(1000 <= quantitat && quantitat <= 5000)
        {
            double descompte3 = quantitat - (quantitat * 0.15);
            System.out.println("Has rebut un descompte del 15%: "+descompte3);
        }
        else if(quantitat > 5000)
        {
            double descompte4 = quantitat - (quantitat*0.25);
            System.out.println("Has rebut un descompte del 25%: " + descompte4);
        }
    }
}
