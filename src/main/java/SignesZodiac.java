// Activitat 24 — Signes del zodíac (switch)
import java.util.Scanner;
public class SignesZodiac {
    public static void main(String[] args) {
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."
        Scanner teclat = new Scanner(System.in);
        System.out.println("Aquari[1] - [20 Gener - 18 Febrer]");
        System.out.println("Piscis[2] - [19 Febrer - 20 Març]");
        System.out.println("Aries[3] - [21 Març - 19 Abril]");
        System.out.println("Tauro[4] - [20 abril - 20 Maig]");
        System.out.println("Gèmini[5] - [21 Maig - 20 Juny]");
        System.out.println("Càncer[6] - [21 Juny - 22 Juliol]");
        System.out.println("Leo[7] - [23 Juliol - 22 Agost]");
        System.out.println("Virgo[8] - [23 Agost - 22 Setembre]");
        System.out.println("Libra[9] - [23 Setembre - 22 Octubre]");
        System.out.println("Escropio[10] - [23 Octubre - 21 Novembre]");
        System.out.println("Sagitari[11] - [22 Novembre - 21 Desembre]");
        System.out.println("Capricorn[12] - [22 Desembre - 19 Gener]");
        
        System.out.println("Introdueix un número: ");
        int numero_zodiac = teclat.nextInt();
        switch (numero_zodiac) {
            case 3: case 7: case 11:
                System.out.println("Signe de Foc");
                break;
            case 4: case 8: case 12:
                System.out.println("Signe de Terra");
                break;
            case 5: case 9: case 1:
                System.out.println("Signe d'Aire");
                break;
            case 6: case 10: case 2:
                System.out.println("Signe d'Aigua");
                break;
            default:
                System.out.println("ERROR: " + numero_zodiac + " no associat a cap signe.");;
        }
    }
}
