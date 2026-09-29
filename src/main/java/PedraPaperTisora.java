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

        System.out.println("Tria una opció: 0 (Pedra), 1 (Paper) o 2 (Tisora)");
        System.out.print("La teva opció: ");
        int opcioUsuari = teclat.nextInt();

        if (opcioOrdinador == 0) 
        {
            System.out.println("L'ordinador ha tret: Pedra");
        } 
        else if (opcioOrdinador == 1) 
        {
            System.out.println("L'ordinador ha tret: Paper");
        } 
        else 
        {
            System.out.println("L'ordinador ha tret: Tisora");
        }


        if (opcioUsuari == opcioOrdinador) {
            System.out.println("Empat!");
        } 
        else if ((opcioUsuari == 0 && opcioOrdinador == 2) || (opcioUsuari == 1 && opcioOrdinador == 0) || (opcioUsuari == 2 && opcioOrdinador == 1)) 
        { 
            System.out.println("Has guanyat!");
        } 
        else 
        {
            System.out.println("Has perdut!");
        }

    }
}
