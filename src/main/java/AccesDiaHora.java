// Activitat 09 — Accés per dia i hora (condicionals aniuades)
// Ajuda: java.util.Calendar -> Calendar.DAY_OF_WEEK, Calendar.SATURDAY, Calendar.SUNDAY, Calendar.HOUR_OF_DAY

import java.util.Calendar;


public class AccesDiaHora {
    public static void main(String[] args) {
        // TODO amb condicionals aniuades:
        //   Si és dissabte -> "NO pots entrar: és dissabte!"
        //   Si és diumenge -> "No pots entrar: és diumenge!"
        //   Si encara no són les 8 -> "No pots entrar: Encara no són es 08:00 hores!"
        //   Si no -> "Benvingut a l'aplicació!!"
    Calendar calendari = Calendar.getInstance();
        
        int dia = calendari.get(Calendar.DAY_OF_WEEK);
        int hora = calendari.get(Calendar.HOUR_OF_DAY);

        if (dia == Calendar.SATURDAY) {
            System.out.println("NO pots entrar: és dissabte!");
        } else {
            if (dia == Calendar.SUNDAY) {
                System.out.println("NO pots entrar: és diumenge!");
            } else {
                if (hora < 8) {
                    System.out.println("No pots entrar: Encara no són es 08:00 hores!");
                } else {
                    System.out.println("Benvingut a l'aplicació!!");
                }
            }
        }
    }
}
