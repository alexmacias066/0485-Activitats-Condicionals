// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1
import java.util.Random;
import java.util.Scanner;
public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta
        Random generador_A = new Random();
        Random generador_B = new Random();

        int numero_A = generador_A.nextInt(1,100);
        int numero_B = generador_B.nextInt(1,100);

        Scanner teclat = new Scanner(System.in);
        System.out.println("Per quin numero apostes A o B? ");
        char numero_apostat = teclat.next().charAt(0);

        char lletra_guanyadora = 'A';
        
        if(numero_B>numero_A)
        {
            lletra_guanyadora = 'B';
        } 
        
        System.out.println("A: " + numero_A);
        System.out.println("B: " + numero_B);
       
        if(lletra_guanyadora == numero_apostat)
        {
            System.out.println("Has guanyat l'aposta.");
        }
        else
        {
            System.out.println("Has perdut l'aposta.");
        }
    }
}
