
import java.util.Scanner;

// Activitat 20 — Login amb usuari i contrasenya
public class LoginUsuariPassword {
    public static void main(String[] args) {
        // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";

        // TODO: demana username i password per teclat
        //   Digues si són correctes o no
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Username: ");
        String usuari = teclat.nextLine();
        
        System.out.println("Password: ");
        String contrasenya = teclat.nextLine();
        
        if(contrasenya.equals(password) && usuari.equals(username))
        {
            System.out.println("Crendecials correctes.");
        }
        else
            {
            System.out.println("Credencials incorrectes.");
        }
    }
}
