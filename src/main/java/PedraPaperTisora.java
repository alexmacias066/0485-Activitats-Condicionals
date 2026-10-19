// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)
import java.util.Random;
import java.util.Scanner;
public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)
        Random pedra_paper_tissora = new Random();
        Scanner teclat = new Scanner(System.in);
        int opcioOrdinador = pedra_paper_tissora.nextInt(3);

        System.out.println("Tria una opció: Pedra, Paper o Tisora");
        System.out.print("La teva opció: ");
        String opcioUsuari = teclat.nextLine();
        int Opcio_Usuari = -1;

        if (opcioUsuari.equalsIgnoreCase("pedra")) {
            Opcio_Usuari = 0;
        } else if (opcioUsuari.equalsIgnoreCase("paper")) {
            Opcio_Usuari = 1;
        } else if (opcioUsuari.equalsIgnoreCase("tisora")) {
            Opcio_Usuari = 2;
        }

        if (opcioOrdinador == 0) {
            System.out.println("L'ordinador ha tret: Pedra");
        } else if (opcioOrdinador == 1) {
            System.out.println("L'ordinador ha tret: Paper");
        } else {
            System.out.println("L'ordinador ha tret: Tisora");
        }

        if (Opcio_Usuari == opcioOrdinador) {
            System.out.println("Empat!");
        } else if ((Opcio_Usuari == 0 && opcioOrdinador == 2) || 
                   (Opcio_Usuari == 1 && opcioOrdinador == 0) || 
                   (Opcio_Usuari == 2 && opcioOrdinador == 1)) {
            System.out.println("Has guanyat!");
        } else {
            System.out.println("Has perdut!");
        }

    }
}
