
import java.util.Scanner;

// Activitat 06 — Rectangle o quadrat
public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el costat 1: ");
        int costat1 = teclat.nextInt();
        System.out.println("Introdueix el costat 2: ");
        int costat2 = teclat.nextInt();

        int perimetre = costat1 * 2 + costat2 * 2;
        int area = costat1 * costat2;

        if (costat1 == costat2) {
            System.out.println("És un quadrat");
        }
        else{
            System.out.println("El perímetre és: " + perimetre + " L'àrea és: " + area);
        }
    }
}
