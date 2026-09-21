// Activitat 08 — Suma i mitjana de 4 enters

import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) 
    {
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix els teus 4 números: ");
        
        Double numero1 = teclat.nextDouble();
        Double numero2 = teclat.nextDouble();
        Double numero3 = teclat.nextDouble();
        Double numero4 = teclat.nextDouble();
        
        Double suma = numero1 + numero2 + numero3 + numero4;
        
        System.out.println("La suma és: " + suma);
        
        Double mitjana = suma/4;  
        
        System.out.println("La mitjana és: " + mitjana);
    } 
} 
