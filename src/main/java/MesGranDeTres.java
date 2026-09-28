
import java.util.Scanner;

// Activitat 12 — El més gran de tres números
public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix 3 números: ");
        double num1 = teclat.nextDouble();
        double num2 = teclat.nextDouble();
        double num3 = teclat.nextDouble();
        
        double major = num1;
        
        if(num2>major)
        {
            major = num2;
        }
        if(num3>major)
        {
            major = num3;
        }
        System.out.println("El número més gran és: "+major);
    }
}
