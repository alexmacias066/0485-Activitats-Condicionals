// Activitat 07 — Convertir Fahrenheit a Celsius

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // TODO: llegeix una temperatura en graus Fahrenheit (número real)
        //       i mostra-la en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en Fahrenheit: ");
        
        Double temperatureF = teclat.nextDouble();
        Double temperatureC = (((temperatureF - 32) * 5) / 9);
        
        System.out.printf("La temperatura en celsius és: %.2f", temperatureC);
    }
}
