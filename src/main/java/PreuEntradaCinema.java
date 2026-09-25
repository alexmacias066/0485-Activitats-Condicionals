
import java.util.Scanner;

// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);
public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final
        Scanner teclat = new Scanner(System.in);
        double preuEntrada=5.0;
        System.out.println("És cap de setmana? (L=Laborable/C=Cap de setmana)");
        char CapSetmana = teclat.next().charAt(0);
        System.out.println("Tens Carnet Jove? (S/N)");
        char CarnetJove = teclat.next().charAt(0);

        boolean CapDeSetmana = (CapSetmana == 'C' || CapSetmana=='c');
        boolean CarnetJ = (CarnetJove == 'S' || CarnetJove == 's');

        double PreuCapSetmana = 0.10;
        double PreuCarnetJove = 0.15;

        if(!CapDeSetmana && !CarnetJ)
        {
            System.out.println("El preu final és: " + preuEntrada + "euros");
        }
        else if(CapDeSetmana && !CarnetJ)
        {
            double preu1 = preuEntrada * PreuCapSetmana;
            System.out.println("El preu final és: " + (preuEntrada + preu1) + "euros");
        }
        else if(!CapDeSetmana && CarnetJ)
        {
            double preu2 = preuEntrada * PreuCarnetJove;
            System.out.println("El preu final és: " + (preuEntrada - preu2) + "euros");
        }
        else if(CapDeSetmana && CarnetJ)
        {
            double preu3 = preuEntrada * PreuCapSetmana;
            double preu4 = preuEntrada * PreuCarnetJove;
            System.out.println("El preu final és: " +(preuEntrada + preu3 - preu4) + "euros");
        }
    }
}
