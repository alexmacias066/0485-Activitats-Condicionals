
import java.util.Scanner;

// Activitat 13 — Índex de massa corporal (IMC)
public class IMC {
    public static void main(String[] args) {
        // TODO: llegeix l'altura en cm i el pes en kg
        //   IMC = pes / (altura_en_metres al quadrat)
        //   Classificació OMS: <18.5 Pes insuficient, <25 Pes normal, <30 Sobrepès, >=30 Obesitat
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix la teva altura en cm: ");
        double altura = teclat.nextDouble();
        System.out.println("Introdueix el teu pes en kg: ");
        double pes = teclat.nextDouble();

        double altura_en_metres = altura / 100;
        double IMC = pes / (altura_en_metres * altura_en_metres);
        if(IMC < 18.5)
        {
            System.out.printf("Pes insuficient: %.2f", IMC);
        }
        else if(IMC < 25)
        {
            System.out.printf("Pes normal: %.2f", IMC);
        }
        else if(IMC < 30)
        {
            System.out.printf("Sobrepès: %.2f", IMC);
        }
        else if(IMC >= 30)
        {
            System.out.printf("Obesitat: %.2f", IMC);
        }

    }
}
