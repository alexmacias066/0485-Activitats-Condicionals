
import java.util.Scanner;

// Activitat 04 — Nota d'una UF (mitjana ponderada)
public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la nota d'activitats");
        double notaA = teclat.nextDouble();
        System.out.println("Introdueix la nota de proves");
        double notaB = teclat.nextDouble();

        double notaFinal = notaA * 0.10 + notaB * 0.90;
        if(notaFinal >= 5){
            System.out.println(notaFinal + "Has aprobat");
        }
        else{
            System.out.println(notaFinal + "Has suspés");
        }
    }
}
